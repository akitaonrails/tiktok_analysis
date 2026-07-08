package X;

import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;

/* JADX INFO: renamed from: X.12Hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19731712Hz implements C12IC {
    public final C12I9 LIZ;
    public final C12HT LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;

    @Override // X.C12IC
    public final void Ec() {
        this.LIZ.Be();
    }

    @Override // X.C12IC
    public final BeautyCategory LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.C12IC
    public final SafeMutableLiveData<List<BeautyComposerInfo>> LJ() {
        if (this.LIZJ) {
            return this.LIZ.LJ();
        }
        C19570511hX.LIZ("getInitComposerNodes: not use composer");
        return new SafeMutableLiveData<>();
    }

    @Override // X.C12IC
    public final boolean Vl() {
        return this.LIZIZ.LIZIZ();
    }

    @Override // X.C12IC
    public final SafeMutableLiveData<List<BeautyComposerInfo>> Xl() {
        if (this.LIZJ) {
            return this.LIZ.mo73if();
        }
        C19570511hX.LIZ("getDownloadedNodes: not use composer");
        return new SafeMutableLiveData<>();
    }

    @Override // X.C12IC
    public final boolean ke() {
        return this.LIZIZ.ke();
    }

    @Override // X.C12IC
    public final boolean Wl() {
        return this.LIZJ;
    }

    @Override // X.C12IC
    public final C12I9 je() {
        return this.LIZ;
    }

    @Override // X.C12IC
    public final void Ul(boolean z, EnumC19731112Ht enumC19731112Ht) {
        if (!this.LIZJ) {
            C19570511hX.LIZ("initComposerEffect: not use composer");
            return;
        }
        if (this.LIZIZ.LJIILLIIL() >= 3) {
            enumC19731112Ht = EnumC19731112Ht.FEMALE;
        }
        if (enumC19731112Ht != EnumC19731112Ht.CUR) {
            this.LIZ.De(z, enumC19731112Ht);
        } else {
            C12I9 c12i9 = this.LIZ;
            c12i9.De(z, c12i9.Se());
        }
    }

    public C19731712Hz(String str, C12HN c12hn, C12HT c12ht) {
        this.LIZ = c12hn;
        this.LIZIZ = c12ht;
        this.LIZLLL = str;
    }
}
