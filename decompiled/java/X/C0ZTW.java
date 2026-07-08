package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZTW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.groupshot.AIGroupShotChatroomAssem$onCreate$1", f = "AIGroupShotChatroomAssem.kt", l = {}, m = "invokeSuspend")
public final class C0ZTW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0ZTW(InterfaceC1364105Vn<? super C0ZTW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZTW(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGroupShotChatroomAssem@b2bb.onCreate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C900300ZTo.LIZ.getClass();
        Set<String> allKey = C900300ZTo.LIZJ.getAllKey();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : allKey) {
            if (true ^ Intrinsics.LJFF(obj2, C900300ZTo.LIZIZ)) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            C900300ZTo c900300ZTo = C900300ZTo.LIZ;
            String string = C900300ZTo.LIZJ.getString(str, "");
            c900300ZTo.getClass();
            for (String str2 : C900300ZTo.LJFF(string)) {
                C1684506ih c1684506ih = new C1684506ih();
                c1684506ih.LIZLLL(16);
                c1684506ih.LIZJ = str2;
                FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, z, z, z, 14, null);
                if (fakeMsgOperatorService != null) {
                    fakeMsgOperatorService.LIZ(str, c1684506ih, null, null);
                }
                Keva keva = C900300ZTo.LJ;
                String string2 = keva.getString(str2, "");
                Keva keva2 = C900300ZTo.LJFF;
                boolean z2 = keva2.getBoolean(str2, z);
                C900300ZTo c900300ZTo2 = C900300ZTo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleUnexpectedTerminationPublish clean create keys: msgUuid=");
                sbLIZ.append(str2);
                sbLIZ.append(", templateId=");
                sbLIZ.append(string2);
                sbLIZ.append(", isGroupChat=");
                sbLIZ.append(z2);
                C2188811AlT.LIZIZ(sbLIZ);
                c900300ZTo2.getClass();
                C911450ZpH c911450ZpH = C911450ZpH.LIZ;
                C13LE.LIZ(C900300ZTo.class);
                c911450ZpH.getClass();
                C900300ZTo.LIZJ(str, string2, true, z2);
                keva.erase(str2);
                keva2.erase(str2);
                z = false;
            }
            C900300ZTo.LIZJ.erase(str);
        }
        Set<String> allKey2 = C900300ZTo.LIZLLL.getAllKey();
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj3 : allKey2) {
            if (!Intrinsics.LJFF(obj3, C900300ZTo.LIZIZ)) {
                arrayList2.add(obj3);
            }
        }
        for (String str3 : arrayList2) {
            C900300ZTo c900300ZTo3 = C900300ZTo.LIZ;
            String string3 = C900300ZTo.LIZLLL.getString(str3, "");
            c900300ZTo3.getClass();
            List listLJFF = C900300ZTo.LJFF(string3);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = listLJFF.iterator();
            while (it3.hasNext()) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it3.next());
                if (lLJIILIIL != null) {
                    arrayList3.add(lLJIILIIL);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                long jLongValue = ((Number) it4.next()).longValue();
                C911450ZpH c911450ZpH2 = C911450ZpH.LIZ;
                c911450ZpH2.getClass();
                C911450ZpH.LIZ(jLongValue);
                Keva keva3 = C900300ZTo.LJ;
                String string4 = keva3.getString(String.valueOf(jLongValue), "");
                Keva keva4 = C900300ZTo.LJFF;
                boolean z3 = keva4.getBoolean(String.valueOf(jLongValue), false);
                C900300ZTo c900300ZTo4 = C900300ZTo.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handleUnexpectedTerminationPublish clean join keys: msgId=");
                sbLIZ2.append(jLongValue);
                sbLIZ2.append(", templateId=");
                sbLIZ2.append(string4);
                sbLIZ2.append(", isGroupChat=");
                sbLIZ2.append(z3);
                C2188811AlT.LIZIZ(sbLIZ2);
                c900300ZTo4.getClass();
                C13LE.LIZ(C900300ZTo.class);
                c911450ZpH2.getClass();
                C900300ZTo.LIZJ(str3, string4, false, z3);
                keva3.erase(String.valueOf(jLongValue));
                keva4.erase(String.valueOf(jLongValue));
            }
            C900300ZTo.LIZLLL.erase(str3);
        }
        if (!C300840Bqk.LIZ()) {
            C0ZTM.LIZIZ.LIZ.LIZLLL();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGroupShotChatroomAssem@b2bb.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0ZTW(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
