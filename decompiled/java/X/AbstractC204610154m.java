package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.154m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC204610154m implements InterfaceC204626155c {
    public C155H LIZ;
    public C1DRG LIZIZ;
    public VideoPublishEditModel LIZJ;
    public AbstractC204621154x LIZLLL;

    @Override // X.InterfaceC204626155c
    public void LLZ() {
    }

    @Override // X.InterfaceC204626155c
    public void LLZIL(String str, boolean z) {
    }

    @Override // X.InterfaceC204626155c
    public void LLZL() {
    }

    @Override // X.InterfaceC204626155c
    public void LLZLI(MusicModel musicModel, MusicModel.CollectionType collectionType) {
    }

    public final C155H LIZJ() {
        C155H c155h = this.LIZ;
        if (c155h != null) {
            return c155h;
        }
        return null;
    }

    public final C1DRG LJFF() {
        C1DRG c1drg = this.LIZIZ;
        if (c1drg != null) {
            return c1drg;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final AbstractC204621154x LJI() {
        AbstractC204621154x abstractC204621154x = this.LIZLLL;
        if (abstractC204621154x != null) {
            return abstractC204621154x;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final IMusicRequestParam LIZLLL() {
        return LIZJ().LIZJ.invoke();
    }

    public final boolean LJ() {
        return LIZLLL().getUnlimitedOnly();
    }

    @Override // X.InterfaceC204626155c
    public final void LLZLL(C1DRG c1drg) {
        this.LIZIZ = c1drg;
        this.LIZ = (C155H) c1drg.LJII(C155H.class, null);
        this.LIZJ = (VideoPublishEditModel) c1drg.LJIIL(null, VideoPublishEditModel.class);
        this.LIZLLL = (AbstractC204621154x) c1drg.LJIIL(null, AbstractC204621154x.class);
        c1drg.LJIIL(null, C204639155p.class);
    }

    public final void LIZIZ(MusicModel musicModel, boolean z) {
        LifecycleCoroutineScope lifecycleCoroutineScopeLJJ;
        AbstractC204621154x abstractC204621154x = this.LIZLLL;
        if (abstractC204621154x != null && (lifecycleCoroutineScopeLJJ = abstractC204621154x.LJJ()) != null) {
            C23250099c.LIZLLL(lifecycleCoroutineScopeLJJ, C0PEM.LIZJ, null, new AnonymousClass1502(this, z, musicModel, null), 2);
        }
    }
}
