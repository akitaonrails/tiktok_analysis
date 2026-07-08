package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestNavBarVM;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Yoe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885580Yoe extends C09AY implements Function1<C2010507uB, C2010507uB> {
    public final /* synthetic */ MessageRequestNavBarVM LL;
    public final /* synthetic */ C885570Yod LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ EnumC880520YgU LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C885430YoP LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885580Yoe(MessageRequestNavBarVM messageRequestNavBarVM, C885570Yod c885570Yod, int i, EnumC880520YgU enumC880520YgU, List<String> list, boolean z, C885430YoP c885430YoP) {
        super(1);
        this.LL = messageRequestNavBarVM;
        this.LLILLJJLI = c885570Yod;
        this.LLILLL = i;
        this.LLILZ = enumC880520YgU;
        this.LLILZIL = list;
        this.LLILZLL = z;
        this.LLIZ = c885430YoP;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2010507uB invoke(C2010507uB c2010507uB) {
        String strLIZIZ;
        int iIntValue;
        MessageRequestNavBarVM messageRequestNavBarVM = this.LL;
        C885570Yod c885570Yod = this.LLILLJJLI;
        C876610YaB c876610YaB = c885570Yod.LLILLL;
        int i = this.LLILLL;
        EnumC880520YgU enumC880520YgU = this.LLILZ;
        Map<EnumC880520YgU, Integer> map = c885570Yod.LLILZ;
        messageRequestNavBarVM.getClass();
        boolean z = false;
        if (enumC880520YgU != null) {
            Integer num = map.get(enumC880520YgU);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (C0CYO.LIZJ.LJIIIIZZ()) {
                strLIZIZ = C1710306mr.LIZIZ(2131847385, String.valueOf(iIntValue));
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C1383370m6R.LJIIJ(2131845905));
                sbLIZ.append('(');
                sbLIZ.append(iIntValue);
                sbLIZ.append(')');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        } else if (c876610YaB == null) {
            strLIZIZ = "";
        } else if (i == 0) {
            strLIZIZ = C1710306mr.LIZIZ(2131821862, Integer.valueOf(C0CYN.LIZ(c876610YaB.LIZLLL(EnumC871430YGn.STRANGER_NOT_RISKY))));
        } else {
            strLIZIZ = C1710306mr.LIZIZ(2131821861, Integer.valueOf(C0CYN.LIZ(c876610YaB.LIZLLL(EnumC871430YGn.ALL_RISKY))));
        }
        List<String> list = this.LLILZIL;
        if (!this.LLILZLL && this.LLIZ.LL == EnumC880850Yh1.NORMAL) {
            z = true;
        }
        return new C2010507uB(strLIZIZ, z, list);
    }
}
