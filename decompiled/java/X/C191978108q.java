package X;

import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.108q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C191978108q extends C2217421BqW implements InterfaceC1631620sYq<Integer, Integer, Throwable, Unit> {
    public C191978108q(C191977108p c191977108p) {
        super(3, c191977108p, C191977108p.class, "onUpdateFailInner", "onUpdateFailInner(IILjava/lang/Throwable;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Integer num2, Throwable th) {
        C632200Oqw c632200Oqw;
        String errorMsg;
        num.intValue();
        int iIntValue = num2.intValue();
        Throwable th2 = th;
        C191977108p c191977108p = (C191977108p) this.receiver;
        C191983108v c191983108v = (C191983108v) ((LinkedHashMap) c191977108p.LLJILJIL).get(Integer.valueOf(iIntValue));
        if (c191983108v != null) {
            c191983108v.LJFF(iIntValue, c191977108p.LLJ.LIZLLL, th2);
        }
        if ((th2 instanceof C632200Oqw) && (c632200Oqw = (C632200Oqw) th2) != null && (errorMsg = c632200Oqw.getErrorMsg()) != null && errorMsg.length() != 0) {
            C191960107y.LJ(c191977108p.LLJ, errorMsg);
        } else {
            C191848103q c191848103q = c191977108p.LLJ;
            C191960107y.LIZ();
            C191960107y.LIZLLL(c191848103q, 2131835079);
        }
        return Unit.LIZ;
    }
}
