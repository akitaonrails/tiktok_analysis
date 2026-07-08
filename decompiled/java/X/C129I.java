package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.129I, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C129I {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final C129G c129g, final List list) {
        if (c129g == null) {
            return;
        }
        final AVMusic aVMusicLLLFZ = c129g.LLLFZ();
        final List data = c129g.getData();
        if (data == null) {
            data = C13BV.INSTANCE;
        }
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(data, list, c129g, aVMusicLLLFZ) { // from class: X.129J
            public final List<MusicModel> LIZ;
            public final List<MusicModel> LIZIZ;
            public final C129G LIZJ;
            public final AVMusic LIZLLL;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                MusicModel musicModel = (MusicModel) ListProtector.get(this.LIZ, i);
                MusicModel musicModel2 = (MusicModel) ListProtector.get(this.LIZIZ, i2);
                boolean zIsSelected = musicModel.isSelected();
                C129G c129g2 = this.LIZJ;
                AVMusic aVMusic = this.LIZLLL;
                c129g2.getClass();
                if (zIsSelected == C129G.LLLII(musicModel2, aVMusic) && musicModel.getCollectionType() == musicModel2.getCollectionType()) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                return Intrinsics.LJFF(((MusicModel) ListProtector.get(this.LIZ, i)).getMusicId(), ((MusicModel) ListProtector.get(this.LIZIZ, i2)).getMusicId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = data;
                this.LIZIZ = list;
                this.LIZJ = c129g;
                this.LIZLLL = aVMusicLLLFZ;
            }
        }, true);
        if (aVMusicLLLFZ == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((MusicModel) it2.next()).setSelected(false);
            }
        } else {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                MusicModel musicModel = (MusicModel) it3.next();
                musicModel.setSelected(C129G.LLLII(musicModel, aVMusicLLLFZ));
            }
        }
        c129g.mmItems = list;
        c21341918fZLIZ.LIZJ(c129g);
    }
}
