package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837430xun extends AbstractC1837220xuS {
    public final Throwable LLILZIL;
    public final InterfaceC1837460xuq LLILZLL;
    public final String LLIZ;

    public final C1837430xun copy(Throwable th, InterfaceC1837460xuq interfaceC1837460xuq, String str) {
        return new C1837430xun(th, interfaceC1837460xuq, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1837430xun)) {
            return false;
        }
        C1837430xun c1837430xun = (C1837430xun) obj;
        return Intrinsics.LJFF(this.LLILZIL, c1837430xun.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1837430xun.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1837430xun.LLIZ);
    }

    public int hashCode() {
        Throwable th = this.LLILZIL;
        int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
        InterfaceC1837460xuq interfaceC1837460xuq = this.LLILZLL;
        int iHashCode2 = (iHashCode + (interfaceC1837460xuq == null ? 0 : interfaceC1837460xuq.hashCode())) * 31;
        String str = this.LLIZ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizTemplateFetchError(bizThrowable=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", clientCheckException=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", msgDisplay=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1837200xuQ
    public int getErrorCode() {
        Throwable th = this.LLILZIL;
        if (th != null) {
            return C512240K7a.LIZ(th);
        }
        InterfaceC1837460xuq interfaceC1837460xuq = this.LLILZLL;
        if (interfaceC1837460xuq != null) {
            return interfaceC1837460xuq.LIZ();
        }
        return -999;
    }

    public final Throwable getBizThrowable() {
        return this.LLILZIL;
    }

    public final InterfaceC1837460xuq getClientCheckException() {
        return this.LLILZLL;
    }

    public final String getMsgDisplay() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1837210xuR
    public EnumC1837330xud getStage() {
        return EnumC1837330xud.BIZ_TEMPLATE_FETCH;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1837430xun(Throwable th, InterfaceC1837460xuq interfaceC1837460xuq, String str) {
        String message;
        if (th == null || (message = C512240K7a.LIZIZ(th)) == null) {
            if (interfaceC1837460xuq != null) {
                message = interfaceC1837460xuq.getMessage();
            } else {
                message = "Failed to fetch business template";
            }
        }
        super(message, str, null);
        this.LLILZIL = th;
        this.LLILZLL = interfaceC1837460xuq;
        this.LLIZ = str;
    }
}
