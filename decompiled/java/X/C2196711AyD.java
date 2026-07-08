package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1AyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196711AyD extends AbstractC2194511Auf {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        List<SchemaParserData> listLIZ;
        SchemaParserData schemaParserData;
        EnumC2196771AyJ enumC2196771AyJ;
        String containerID;
        InterfaceC2194521Aug interfaceC2194521Aug = (InterfaceC2194521Aug) xBaseParamModel;
        if (C0BVF.LIZ()) {
            List<InterfaceC2194491Aud> clientKeyList = interfaceC2194521Aug.getClientKeyList();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(clientKeyList, 10));
            Iterator<InterfaceC2194491Aud> it2 = clientKeyList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getSchema());
            }
            if (!arrayList.isEmpty() && (listLIZ = C1869270yk9.LIZ(C13LP.LL(arrayList, 1))) != null && (schemaParserData = (SchemaParserData) C13LP.LJJJLL(listLIZ)) != null) {
                String enterFrom = schemaParserData.getEnterFrom();
                if (u.LJJIIJZLJL(enterFrom, "center", false)) {
                    enumC2196771AyJ = EnumC2196771AyJ.CENTER;
                } else if (u.LJJIIJZLJL(enterFrom, "fyf", false)) {
                    enumC2196771AyJ = EnumC2196771AyJ.FYF_LYNX;
                } else {
                    enumC2196771AyJ = EnumC2196771AyJ.UNKNOWN;
                }
                C2196741AyG c2196741AyG = new C2196741AyG(enumC2196771AyJ, arrayList);
                c2196741AyG.LJ();
                c2196741AyG.LJFF().LIZJ = true;
                c2196741AyG.LIZIZ();
                c2196741AyG.LJFF().LIZLLL = true;
                c2196741AyG.LIZJ();
                c2196741AyG.LIZ(C1528860pt6.LIZ(enumC2196771AyJ));
                c2196741AyG.LJI();
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC2194501Aue.class);
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                } else {
                    containerID = null;
                }
                completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZJ(containerID, c19719912DlLIZ), "");
            }
        }
    }
}
