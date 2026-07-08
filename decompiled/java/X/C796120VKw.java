package X;

import Y.ACallableS245S0200000_13;
import Y.ACallableS65S1100000_13;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftDatabase;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796120VKw implements InterfaceC20582915gR {
    public final AbstractC796540VMm LIZ;
    public final C854560Xfi LIZIZ;
    public final C0VM5 LIZJ = new C0VM5();
    public final C854550Xfh LIZLLL;

    public C796120VKw(StoryThoughtDraftDatabase storyThoughtDraftDatabase) {
        this.LIZ = storyThoughtDraftDatabase;
        this.LIZIZ = new C854560Xfi(this, storyThoughtDraftDatabase, 3);
        this.LIZLLL = new C854550Xfh(storyThoughtDraftDatabase, 76);
        new C854550Xfh(storyThoughtDraftDatabase, 77);
    }

    @Override // X.InterfaceC20582915gR
    public final LiveData<List<C817600W5m>> LIZIZ(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM story_thought_drafts WHERE uid = ? AND task_status == 2 AND is_read == 0 ORDER BY created_time DESC, task_id DESC");
        c0vn5LIZLLL.LJIILIIL(1, str);
        return this.LIZ.mInvalidationTracker.LIZIZ(new String[]{"story_thought_drafts"}, new ACallableS245S0200000_13(this, c0vn5LIZLLL, 53));
    }

    @Override // X.InterfaceC20582915gR
    public final LiveData<List<C817600W5m>> LJ(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM story_thought_drafts WHERE uid = ? ORDER BY created_time DESC, task_id DESC");
        c0vn5LIZLLL.LJIILIIL(1, str);
        return this.LIZ.mInvalidationTracker.LIZIZ(new String[]{"story_thought_drafts"}, new ACallableS245S0200000_13(this, c0vn5LIZLLL, 57));
    }

    @Override // X.InterfaceC20582915gR
    public final Object LIZ(String str, InterfaceC1364105Vn<? super C817600W5m> interfaceC1364105Vn) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM story_thought_drafts WHERE task_id = ?");
        c0vn5LIZLLL.LJIILIIL(1, str);
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 54), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC20582915gR
    public final Object LIZJ(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS65S1100000_13(this, str, 4), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC20582915gR
    public final Object LIZLLL(List<String> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, list, 55), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC20582915gR
    public final Object LJFF(C817600W5m c817600W5m, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, c817600W5m, 56), interfaceC1364105Vn);
    }
}
