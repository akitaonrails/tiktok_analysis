package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o3B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458230o3B implements InterfaceC19882712qn<C1458250o3D, String> {
    public final List<InterfaceC1458270o3F> LL;

    public C1458230o3B() {
        ArrayList arrayList = new ArrayList();
        this.LL = arrayList;
        arrayList.add(new InterfaceC1458270o3F() { // from class: X.0o39
            @Override // X.InterfaceC1458270o3F
            public final boolean LIZ(C1458250o3D c1458250o3D) {
                String str;
                if (c1458250o3D == null || (str = c1458250o3D.LIZ) == null || !str.equals("shoot_music_panel")) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1458270o3F
            public final String LIZIZ(C1458250o3D c1458250o3D) {
                if (c1458250o3D == null) {
                    return "";
                }
                String str = c1458250o3D.LIZJ;
                if (Intrinsics.LJFF(str, EnumC1654750tA9.TAB_AI.getStringValue())) {
                    return "shoot_page_recommend";
                }
                if (Intrinsics.LJFF(str, EnumC1654750tA9.TAB_COLLECT.getStringValue())) {
                    if (Intrinsics.LJFF(c1458250o3D.LIZLLL, EnumC1458240o3C.POST.getValue())) {
                        return "shoot_page_recommend_favourite_video";
                    }
                    return "shoot_page_recommend_favourite";
                }
                if (Intrinsics.LJFF(str, EnumC1654750tA9.TAB_RECENT.getStringValue())) {
                    return "shoot_page_recent";
                }
                if (Intrinsics.LJFF(str, EnumC1654750tA9.TAB_HOT.getStringValue())) {
                    return "shoot_page_hot_music";
                }
                return "prop_panel_discovery";
            }
        });
        arrayList.add(new InterfaceC1458270o3F() { // from class: X.0o3A
            @Override // X.InterfaceC1458270o3F
            public final boolean LIZ(C1458250o3D c1458250o3D) {
                String str;
                if (c1458250o3D == null || (str = c1458250o3D.LIZ) == null || !str.equals("edit_music_panel")) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1458270o3F
            public final String LIZIZ(C1458250o3D c1458250o3D) {
                MusicModel.MusicItemType musicItemType;
                boolean z;
                if (c1458250o3D == null) {
                    return "";
                }
                boolean zLJFF = Intrinsics.LJFF(c1458250o3D.LIZJ, EnumC1654750tA9.TAB_AI.getStringValue());
                MusicModel musicModel = c1458250o3D.LIZIZ;
                String musicSelectedFrom = null;
                if (musicModel != null) {
                    musicItemType = musicModel.getMusicItemType();
                } else {
                    musicItemType = null;
                }
                if (musicItemType == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zLJFF2 = Intrinsics.LJFF(c1458250o3D.LIZJ, EnumC1654750tA9.TAB_RECENT.getStringValue());
                String str = c1458250o3D.LIZJ;
                MusicModel musicModel2 = c1458250o3D.LIZIZ;
                if (musicModel2 != null) {
                    musicSelectedFrom = musicModel2.getMusicSelectedFrom();
                }
                if (Intrinsics.LJFF(musicSelectedFrom, "video_capsule_recommend")) {
                    return "video_capsule_recommend";
                }
                MusicModel musicModel3 = c1458250o3D.LIZIZ;
                if (musicModel3 != null && musicModel3.isMemeSong()) {
                    return "create_or_edit_meme_song";
                }
                if (zLJFF) {
                    return "edit_page_recommend";
                }
                if (Intrinsics.LJFF(str, EnumC1654750tA9.TAB_HOT.getStringValue())) {
                    return "edit_page_hot_music";
                }
                if (z) {
                    return "edit_page_recommend_favourite_recommend";
                }
                if (zLJFF2) {
                    return "edit_page_recent";
                }
                if (Intrinsics.LJFF(c1458250o3D.LIZLLL, EnumC1458240o3C.POST.getValue())) {
                    return "edit_page_recommend_favourite_video";
                }
                return "edit_page_recommend_favourite";
            }
        });
    }

    @Override // X.InterfaceC19882712qn
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final String apply(C1458250o3D c1458250o3D) {
        for (InterfaceC1458270o3F interfaceC1458270o3F : this.LL) {
            if (interfaceC1458270o3F.LIZ(c1458250o3D)) {
                return interfaceC1458270o3F.LIZIZ(c1458250o3D);
            }
        }
        return "";
    }
}
