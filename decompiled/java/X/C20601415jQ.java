package X;

import com.bytedance.ies.powerlist.PowerStub;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15jQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20601415jQ extends C09AY implements Function1<C20600915jL<InterfaceC1891350zJl>, Boolean> {
    public final /* synthetic */ PowerStub LL;
    public final /* synthetic */ PowerStub LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20601415jQ(PowerStub powerStub, PowerStub powerStub2) {
        super(1);
        this.LL = powerStub;
        this.LLILLJJLI = powerStub2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C20600915jL<InterfaceC1891350zJl> c20600915jL) {
        boolean z;
        C20600915jL<InterfaceC1891350zJl> c20600915jL2 = c20600915jL;
        if (!this.LL.LL.LLILZLL().LJ) {
            z = false;
        } else {
            if (this.LL.LL.LLILZLL().LJIJJ) {
                ((ArrayList) this.LLILLJJLI.LLJILJIL).clear();
                ((ArrayList) this.LLILLJJLI.LLJILJIL).addAll(c20600915jL2.LIZ);
            } else {
                ((ArrayList) this.LL.LLJILJIL).clear();
                ((ArrayList) this.LL.LLJILJIL).addAll(c20600915jL2.LIZ);
            }
            this.LL.LLILZ.invoke(new C1891440zJu(c20600915jL2.LIZIZ, false, c20600915jL2.LIZJ, true, c20600915jL2.LIZLLL));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
