package X;

import Y.AComparatorS21S0000000_2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.common.experiment.FakeMessageConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06u7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1755306u7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list, C869590Y9l c869590Y9l, List list2, InterfaceC876950Yaj interfaceC876950Yaj) {
        String lastShowMessageUuid;
        C869590Y9l c869590Y9l2;
        Map<String, String> localExt;
        String str;
        Integer numLJIIJJI;
        ArrayList arrayList = (ArrayList) list;
        boolean z = false;
        int iLJFF = C1697810uHb.LJFF(list, c869590Y9l, new AComparatorS21S0000000_2(24), 0, Math.min(((FakeMessageConfig.Config) FakeMessageConfig.LIZIZ.getValue()).maxSearchIndex, arrayList.size()));
        if (iLJFF < 0) {
            iLJFF = (-iLJFF) - 1;
        }
        C0Y8T c0y8tLIZ = interfaceC876950Yaj.LIZ(c869590Y9l.getConversationId());
        if (c0y8tLIZ == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!list2.contains(((C869590Y9l) obj).getUuid())) {
                arrayList2.add(obj);
            }
        }
        C869590Y9l c869590Y9l3 = (C869590Y9l) C13LP.LJJJLZIJ(0, arrayList2);
        String uuid = null;
        if (c869590Y9l3 != null) {
            uuid = c869590Y9l3.getUuid();
        }
        C869590Y9l lastShowMessage = c0y8tLIZ.getLastShowMessage();
        if ((lastShowMessage != null && lastShowMessage.getMsgType() == EnumC868450Y5b.MsgTypeHelloSticker.getValue()) || (lastShowMessageUuid = c0y8tLIZ.getLastShowMessageUuid()) == null || lastShowMessageUuid.length() == 0 || Intrinsics.LJFF(lastShowMessageUuid, uuid)) {
            z = true;
        }
        if (arrayList.size() == 0 || iLJFF != arrayList.size()) {
            if (iLJFF == 0 && !z) {
                return;
            }
            if (((Boolean) C1755406u8.LIZ.getValue()).booleanValue()) {
                while (iLJFF < arrayList.size() && (c869590Y9l2 = (C869590Y9l) ListProtector.get(list, iLJFF)) != null && (localExt = c869590Y9l2.getLocalExt()) != null && (str = localExt.get("fake_msg_position_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null && numLJIIJJI.intValue() == 2) {
                    iLJFF++;
                }
            }
            ListProtector.add(list, iLJFF, c869590Y9l);
        }
    }
}
