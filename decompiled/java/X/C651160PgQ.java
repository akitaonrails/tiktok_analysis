package X;

import android.view.KeyEvent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import defpackage.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0PgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651160PgQ extends t {
    public CompletionBlock<t.c> LLILLL;
    public AnonymousClass0956 LLILZ;
    public AnonymousClass0956 LLILZIL;

    public final ArrayList<Map<?, ?>> LJ(n nVar, String str) {
        KeyEvent.Callback view;
        InterfaceC1541990qEH interfaceC1541990qEH;
        ArrayList<String> arrayList = (ArrayList) a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 0, 6);
        for (String str2 : arrayList) {
            k kVarLJJIIZ = nVar.LJJIIZ(str2);
            kVarLJJIIZ.getClass();
            if (kVarLJJIIZ instanceof h) {
                Gson gson = C7740030o.LIZ().getGson();
                ArrayList<Map<?, ?>> arrayList2 = (ArrayList) GsonProtectorUtils.fromJson(gson, nVar.LJJIIZ(str2), new TypeToken<ArrayList<Map<?, ?>>>() { // from class: X.0PgV
                }.getType());
                C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                C1537480q70 hybridContext = null;
                if (interfaceC634840OvC != null) {
                    view = interfaceC634840OvC.getView();
                } else {
                    view = null;
                }
                if ((view instanceof InterfaceC1541990qEH) && (interfaceC1541990qEH = (InterfaceC1541990qEH) view) != null) {
                    hybridContext = interfaceC1541990qEH.getHybridContext();
                }
                c647380PaK.getClass();
                nVar.LJJIFFI(str2, GsonProtectorUtils.toJsonTree(gson, C647380PaK.LJIIIIZZ(hybridContext, arrayList2)));
                return arrayList2;
            }
            nVar = nVar.LJJIJ(str2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme list not found, path is ");
        sbLIZ.append(arrayList.toArray());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(int i, List list, C649040Pd0 c649040Pd0) {
        String tokenType;
        String str;
        String strLJ;
        List<Aweme> listLIZ;
        Aweme aweme;
        List<DynamicPatch.SearchMultiTabListData> list2;
        DynamicPatch.SearchMultiTabListData searchMultiTabListData;
        DynamicPatch dynamicPatch;
        if (c649040Pd0 == null || (dynamicPatch = c649040Pd0.LIZ) == null || (tokenType = dynamicPatch.getTokenType()) == null) {
            tokenType = "";
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme2 = (Aweme) it2.next();
                AwemeBizExtKt.setSearchTabRank(aweme2, Integer.valueOf(i));
                if (c649040Pd0 == null || (list2 = c649040Pd0.LJIIIIZZ) == null || (searchMultiTabListData = (DynamicPatch.SearchMultiTabListData) ListProtector.get(list2, i)) == null || (str = searchMultiTabListData.tabKey) == null) {
                    str = "";
                }
                AwemeBizExtKt.setSearchTabName(aweme2, str);
                AwemeExtKt.appendExtraParamUseInSearch(aweme2, "token_type", tokenType);
                if (c649040Pd0 != null && (listLIZ = c649040Pd0.LIZ(i)) != null && (aweme = (Aweme) C13LP.LJJJLZIJ(0, listLIZ)) != null) {
                    strLJ = C643200PKs.LJ(aweme);
                } else {
                    strLJ = null;
                }
                C643200PKs.LIZJ(aweme2, strLJ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:20:0x006a, B:21:0x006d, B:23:0x008a, B:24:0x008e, B:26:0x0096, B:27:0x009a, B:31:0x00a4, B:32:0x00a7, B:34:0x00ab, B:37:0x00b3, B:39:0x00b7, B:40:0x00c3, B:41:0x00c5, B:43:0x00d3, B:45:0x00d7, B:47:0x00dd, B:49:0x00e3, B:53:0x00ed, B:55:0x00f3, B:58:0x00fd, B:61:0x0103, B:63:0x0109, B:64:0x010c, B:66:0x011e, B:68:0x0124, B:69:0x0128, B:15:0x003d, B:16:0x0042, B:17:0x005d, B:72:0x0137, B:73:0x013e), top: B:83:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r19, X.C651000PgA r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C651160PgQ.LIZLLL(int, X.0PgA, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011f  */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.fragment.app.Fragment] */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r25, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r26, X.EnumC1063300dmC r27) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C651160PgQ.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
