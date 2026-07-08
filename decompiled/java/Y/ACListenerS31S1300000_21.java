package Y;

import X.C01GW;
import X.C0I0B;
import X.C0RGG;
import X.C0SSJ;
import X.C12848051a;
import X.C1355310lNB;
import X.C1364590lc9;
import X.C1368370liF;
import X.C1369870lkf;
import X.C1370370llT;
import X.C1371810lnn;
import X.C1371840lnq;
import X.C1371850lnr;
import X.C1380980m2a;
import X.C1383760m74;
import X.C1383770m75;
import X.C1391190mJ3;
import X.C1440005kM;
import X.C1599690rjL;
import X.C19EG;
import X.C343950De5;
import X.C343970De7;
import X.C586380MzE;
import X.C607070NrV;
import X.C621180OYa;
import X.C714060Rzg;
import X.C786410Ut5;
import X.EnumC1616310sA9;
import X.InterfaceC1355320lNC;
import X.InterfaceC1361990lXx;
import X.InterfaceC1362600lYw;
import X.InterfaceC1362720lZ8;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1367490lgp;
import X.InterfaceC1493505sz;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ACListenerS31S1300000_21 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS31S1300000_21 aCListenerS31S1300000_21, View view) {
        final String aid;
        String authorUid;
        String authorUid2;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((LinearLayout) aCListenerS31S1300000_21.l1, C343970De7.LIZ);
        C1383760m74.LIZIZ.LJIIJJI((C19EG) aCListenerS31S1300000_21.l2, aCListenerS31S1300000_21.s0, (Aweme) aCListenerS31S1300000_21.l3);
        final String str2 = aCListenerS31S1300000_21.s0;
        Aweme aweme = (Aweme) aCListenerS31S1300000_21.l3;
        final String str3 = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        Aweme aweme2 = (Aweme) aCListenerS31S1300000_21.l3;
        if (aweme2 != null && (authorUid2 = AwemeExtKt.getAuthorUid(aweme2)) != null) {
            str3 = authorUid2;
        }
        final String curUserId = C1383770m75.LIZ().LJIIJ().getCurUserId();
        Aweme aweme3 = (Aweme) aCListenerS31S1300000_21.l3;
        if (aweme3 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme3);
        } else {
            authorUid = null;
        }
        final boolean zLJFF = Intrinsics.LJFF(authorUid, C1383770m75.LIZ().LJIIJ().getCurUserId());
        C1355310lNB.LIZ(new InterfaceC1355320lNC(str2, aid, str3, curUserId, zLJFF) { // from class: X.00HB
            public final String LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final boolean LJ;

            @Override // X.InterfaceC1355320lNC
            public final Map<String, String> LIZ() {
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair("enter_from", this.LIZ);
                pairArr[1] = new Pair("group_id", this.LIZIZ);
                pairArr[2] = new Pair("author_id", this.LIZJ);
                pairArr[3] = new Pair("user_id", this.LIZLLL);
                pairArr[4] = new Pair("is_author", this.LJ ? "1" : CardStruct.IStatusCode.DEFAULT);
                return C2097608Jq.LJIIIIZZ(pairArr);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C00HB)) {
                    return false;
                }
                C00HB c00hb = (C00HB) obj;
                return Intrinsics.LJFF(this.LIZ, c00hb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00hb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00hb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00hb.LIZLLL) && this.LJ == c00hb.LJ;
            }

            @Override // X.InterfaceC1355320lNC
            public final String getEventName() {
                return "danmaku_list_click";
            }

            public final int hashCode() {
                return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DanmakuListClickEvent(enterFrom=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", groupId=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", authorId=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", userId=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", isAuthor=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str2;
                this.LIZIZ = aid;
                this.LIZJ = str3;
                this.LIZLLL = curUserId;
                this.LJ = zLJFF;
            }
        });
    }

    public static final void onClick$1(ACListenerS31S1300000_21 aCListenerS31S1300000_21, View view) {
        Function0 function0 = (Function0) aCListenerS31S1300000_21.l1;
        if (function0 != null) {
            function0.invoke();
        }
        String str = aCListenerS31S1300000_21.s0;
        if (str == null) {
            return;
        }
        C1380980m2a c1380980m2a = (C1380980m2a) aCListenerS31S1300000_21.l2;
        Context context = ((ViewGroup) aCListenerS31S1300000_21.l3).getContext();
        c1380980m2a.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, UriProtector.parse("aweme://roma_redirect/?spark_page=amber_detail_feed_page").buildUpon().appendQueryParameter("amberUrl", str).toString());
        smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.0unO
            @Override // com.bytedance.router.OpenResultCallback
            public final void onActionResult(Object obj) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onEmpty() {
                C1951107kb.LIZ(this);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onFail(String str2, String str3) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onIntercept(String str2) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMatched(String str2) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMissed(String str2) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onOpen(Intent intent) {
                C1951107kb.LIZIZ(this, intent);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
            }
        });
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0lct] */
    public static final void onClick$2(ACListenerS31S1300000_21 aCListenerS31S1300000_21, View view) {
        int iIntValue;
        IMSharePanelApi.LIZ.getClass();
        InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
        List listSingletonList = Collections.singletonList((IMContact) aCListenerS31S1300000_21.l1);
        final C1368370liF c1368370liF = (C1368370liF) aCListenerS31S1300000_21.l2;
        SharePackage sharePackage = c1368370liF.LLJILLL;
        Map<String, String> map = c1368370liF.LLJJIJIIJIL;
        Map<String, String> map2 = c1368370liF.LLJJIJI;
        String str = aCListenerS31S1300000_21.s0;
        final IMContact iMContact = (IMContact) aCListenerS31S1300000_21.l1;
        shareService.LJJJJZI(listSingletonList, "", sharePackage, map, map2, str, new InterfaceC1361990lXx() { // from class: X.0lct
            @Override // X.InterfaceC1361990lXx
            public final /* synthetic */ void LIZIZ(HashMap map3) {
            }

            @Override // X.InterfaceC1361990lXx
            public final void LIZ() {
                Activity activity;
                Context context = c1368370liF.LLJILJIL.getContext();
                if (!(context instanceof Activity) || (activity = (Activity) context) == null) {
                    return;
                }
                C1731406qG c1731406qG = C1731406qG.LIZ;
                String uid = iMContact.getUid();
                String strLIZIZ = C1529905yr.LIZIZ(iMContact);
                c1731406qG.getClass();
                C1731406qG.LIZ(null, activity, uid, strLIZIZ, false);
            }
        }, null, null);
        C1364590lc9 c1364590lc9 = C1364590lc9.LIZ;
        SharePackage sharePackage2 = ((C1368370liF) aCListenerS31S1300000_21.l2).LLJILLL;
        List listSingletonList2 = Collections.singletonList((IMContact) aCListenerS31S1300000_21.l1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c1364590lc9.getClass();
        C1364590lc9.LIZLLL(sharePackage2, null, listSingletonList2, jCurrentTimeMillis, interfaceC1493505szLIZIZ, -1);
        Function0<Integer> function0 = ((C1368370liF) aCListenerS31S1300000_21.l2).LLJJIJIL;
        if (function0 != null) {
            iIntValue = function0.invoke().intValue();
        } else {
            iIntValue = 0;
        }
        C1368370liF c1368370liF2 = (C1368370liF) aCListenerS31S1300000_21.l2;
        SharePackage sharePackage3 = c1368370liF2.LLJILLL;
        sharePackage3.extras.putInt("rank_num", c1368370liF2.getBindingAdapterPosition() - iIntValue);
        C1364590lc9.LJI(sharePackage3, (IMContact) aCListenerS31S1300000_21.l1, false, "chat_head", C0I0B.LJFF.LIZIZ(), 0);
        ((InterfaceC1362600lYw) aCListenerS31S1300000_21.l3).LJFF(((C1368370liF) aCListenerS31S1300000_21.l2).LLJILLL);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.Integer, java.lang.Object] */
    public static final void onClick$3(ACListenerS31S1300000_21 aCListenerS31S1300000_21, View view) {
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        String str = aCListenerS31S1300000_21.s0;
        String string = ((C1371850lnr) aCListenerS31S1300000_21.l1).LIZLLL.getString("group_id");
        if (string == null) {
            string = "";
        }
        C1369870lkf.LJIIL(str, "click_share_panel", string, "click");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", "click_move_functions_guide_toast");
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("click_more_button", linkedHashMap);
        }
        InterfaceC1362720lZ8 interfaceC1362720lZ8 = (InterfaceC1362720lZ8) ((Function0) aCListenerS31S1300000_21.l2).invoke();
        if (interfaceC1362720lZ8 != null) {
            interfaceC1362720lZ8.F8(new C343950De5());
        }
        C1371840lnq c1371840lnq = C1371810lnn.LIZ;
        String str2 = aCListenerS31S1300000_21.s0;
        c1371840lnq.getClass();
        if (Intrinsics.LJFF(str2, "homepage_hot")) {
            C607070NrV<Integer> c607070NrV = C1371810lnn.LIZIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1371840lnq.LIZ;
            C12848051a.LIZIZ(c607070NrV.LIZ, -1, c607070NrV.LIZIZ);
            c607070NrV.LIZLLL = -1;
        } else {
            C607070NrV<Integer> c607070NrV2 = C1371810lnn.LIZJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1371840lnq.LIZ;
            C12848051a.LIZIZ(c607070NrV2.LIZ, -1, c607070NrV2.LIZIZ);
            c607070NrV2.LIZLLL = -1;
        }
        C786410Ut5.LJLLLLLL(8, ((View) aCListenerS31S1300000_21.l3).findViewById(R.id.lc0));
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        if (C586380MzE.LIZ().LIZLLL()) {
            C1440005kM.LIZ(new C714060Rzg(false, EnumC1616310sA9.OTHER_EXIT.getType(), "", aCListenerS31S1300000_21.s0));
        }
        ShareService shareService = C621180OYa.LIZ;
        C1371850lnr c1371850lnr = (C1371850lnr) aCListenerS31S1300000_21.l1;
        Activity activity = c1371850lnr.LIZ;
        Fragment fragment = c1371850lnr.LIZIZ;
        Aweme aweme = c1371850lnr.LIZJ;
        boolean zLIZ = C0SSJ.LIZ(aweme);
        Bundle bundle = ((C1371850lnr) aCListenerS31S1300000_21.l1).LIZLLL;
        C786410Ut5.LJJJI("enter_method", "share_panel", bundle);
        C786410Ut5.LJJJI("panel_source", "share_panel", bundle);
        bundle.putBoolean("is_from_lpp_move_tips", true);
        shareService.LJJIIJ(activity, fragment, aweme, zLIZ, null, bundle);
    }

    public ACListenerS31S1300000_21(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
    }
}
