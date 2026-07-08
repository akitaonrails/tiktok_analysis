package X;

import android.content.Intent;
import android.os.Build;
import androidx.activity.result.ActivityResult;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.search.SearchPinnedMusicList;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632480OrO extends C09AY implements Function1<ActivityResult, Unit> {
    public final /* synthetic */ List<MusicGroup> LL;
    public final /* synthetic */ OriginMusicListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632480OrO(List<MusicGroup> list, OriginMusicListViewModel originMusicListViewModel) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = originMusicListViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ActivityResult activityResult) {
        SearchPinnedMusicList searchPinnedMusicList;
        ActivityResult activityResult2 = activityResult;
        if (activityResult2.resultCode == -1) {
            Intent intent = activityResult2.data;
            if (Build.VERSION.SDK_INT >= 33) {
                if (intent == null || (searchPinnedMusicList = (SearchPinnedMusicList) intent.getSerializableExtra("pinned_music_list", SearchPinnedMusicList.class)) == null) {
                    searchPinnedMusicList = new SearchPinnedMusicList();
                }
            } else {
                Serializable serializableExtra = null;
                if (intent != null) {
                    serializableExtra = intent.getSerializableExtra("pinned_music_list");
                }
                if (!(serializableExtra instanceof SearchPinnedMusicList) || (searchPinnedMusicList = (SearchPinnedMusicList) serializableExtra) == null) {
                    searchPinnedMusicList = new SearchPinnedMusicList();
                }
            }
            if (!Intrinsics.LJFF(this.LL, searchPinnedMusicList.getMusicGroups())) {
                this.LLILLJJLI.refresh();
            }
        }
        return Unit.LIZ;
    }
}
