package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qo0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681340Qo0 implements InterfaceC1891350zJl {
    public final Word LL;
    public final int LLILLJJLI;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C681340Qo0) {
            C681340Qo0 c681340Qo0 = (C681340Qo0) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c681340Qo0.LL.getWord(), this.LL.getWord()) && c681340Qo0.LLILLJJLI == this.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C681340Qo0(Word word, int i) {
        this.LL = word;
        this.LLILLJJLI = i;
    }
}
