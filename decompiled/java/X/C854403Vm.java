package X;

import Y.AObjectS534S0100000_1;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ConsentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PrivacyButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PrivacyDialog;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PrivacyPopup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03Vm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C854403Vm implements C03VI {
    public final OrderSubmitAssemViewModel LIZ;
    public C1397510mTF LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(492));

    @Override // X.C03VI
    public final void LIZIZ() {
        C1397510mTF c1397510mTF = this.LIZIZ;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
        this.LIZIZ = null;
    }

    public C854403Vm(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.03jV, android.view.View] */
    @Override // X.C03VI
    public final void LIZ(final Context context, C035X c035x) {
        PrivacyPopup privacyPopup;
        PrivacyDialog privacyDialog;
        if (!C854903Vr.LIZ().enable || (privacyPopup = c035x.LIZ) == null || (privacyDialog = privacyPopup.popup) == null) {
            return;
        }
        Boolean bool = c035x.LIZIZ;
        PrivacyButton privacyButton = privacyDialog.closeButton;
        if (this.LIZIZ != null) {
            LIZIZ();
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        LinearLayout linearLayout = new LinearLayout(context);
        boolean z = true;
        linearLayout.setOrientation(1);
        String str = privacyDialog.title;
        HashMap<String, Object> mapLJIIJ = null;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        if (str == null) {
            str = "";
        }
        tuxTextView.setText(str);
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(23);
        tuxTextView.setTextColorRes(R.attr.a1h);
        ECRichText eCRichText = privacyDialog.text;
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(tuxTextView, 1722);
        ?? r11 = new ScrollView(context) { // from class: X.03jV
            public Function0<Integer> LL;
            public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1723));

            private final TuxTextView getDescTv() {
                return (TuxTextView) this.LLILLJJLI.getValue();
            }

            public final Function0<Integer> getMaxHeightCalc() {
                return this.LL;
            }

            {
                setFillViewport(false);
                setOverScrollMode(2);
                C1546210qL5.LIZ.getClass();
                C0H1U.LJIIJ(C814420VxA.LIZIZ(C1546210qL5.LIZ(12)), this);
                addView(getDescTv(), new FrameLayout.LayoutParams(-1, -2));
            }

            @Override // android.view.ViewGroup, android.view.View
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (C788530UwV.LIZ("dispatchScrollViewTouchEvent")) {
                    C2188191AkT.LIZLLL();
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            public final void setDescRichText(ECRichText eCRichText2) {
                AObjectS534S0100000_1 aObjectS534S0100000_1;
                if (eCRichText2 == null) {
                    getDescTv().setText("");
                    return;
                }
                if (C854903Vr.LIZ().enableCustomLinkHandler) {
                    aObjectS534S0100000_1 = new AObjectS534S0100000_1(this, 5);
                } else {
                    aObjectS534S0100000_1 = null;
                }
                getDescTv().setText(C03C8.LIZ(getDescTv(), eCRichText2, "order_submit_privacy_popup", aObjectS534S0100000_1, null, false, 24));
            }

            public final void setMaxHeightCalc(Function0<Integer> function0) {
                this.LL = function0;
            }

            @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
            public final void onMeasure(int i, int i2) {
                int iIntValue;
                Function0<Integer> function0 = this.LL;
                if (function0 != null && (iIntValue = function0.invoke().intValue()) > 0) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iIntValue, Integer.MIN_VALUE));
                } else {
                    super.onMeasure(i, i2);
                }
            }
        };
        r11.setMaxHeightCalc(awS545S0100000_1);
        r11.setDescRichText(eCRichText);
        linearLayout.addView(tuxTextView, -1, -2);
        linearLayout.addView((View) r11, -1, -2);
        if (C854903Vr.LIZ().enableAccessoryAdapt) {
            linearLayout.addOnAttachStateChangeListener(new C04JG(0));
        }
        C384000F3u.LIZ(c1397580mTM, linearLayout);
        if (privacyButton == null) {
            z = false;
        }
        c1397580mTM.LJIIIIZZ = z;
        c1397580mTM.LJII = false;
        c1397580mTM.LIZLLL(new AwS100S0400000_1(privacyButton, this, privacyPopup, bool, 32));
        C985403tE.LIZ(c1397580mTM, new AwS210S0300000_1(privacyDialog, this, privacyPopup, 103));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        c1397510mTF.LIZLLL();
        String str2 = privacyPopup.daInfo;
        if (str2 != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str2);
        }
        C03O0.LJJLIIIJILLIZJL(C03O0.LIZ, "terms_update_notice", null, null, mapLJIIJ, null, true, 22);
        this.LIZIZ = c1397510mTF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public final void LIZJ(String str, Integer num, PrivacyPopup privacyPopup) {
        List<ConsentInfo> list;
        ?? arrayList;
        Integer num2;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        String str2;
        boolean z;
        String name;
        HashMap<String, Object> mapLJIIJ = null;
        if (privacyPopup != null) {
            list = privacyPopup.consentInfos;
        } else {
            list = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<ConsentInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                String str3 = it2.next().key;
                if (str3 != null) {
                    arrayList.add(str3);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("entity_keys", new JSONArray((Collection) arrayList));
        ((InterfaceC854803Vq) this.LIZJ.getValue()).LIZIZ(str, jSONObject);
        int value = EnumC854703Vp.CLOSE.getValue();
        if (num != null && num.intValue() == value) {
            num2 = 3;
        } else {
            int value2 = EnumC854703Vp.ACCEPT.getValue();
            if (num != null && num.intValue() == value2) {
                num2 = 1;
            }
            ((InterfaceC854803Vq) this.LIZJ.getValue()).LIZJ(str, EnumC854603Vo.ACTION_TYPE_INVALID, jSONObject);
        }
        if (num2 != null) {
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (ConsentInfo consentInfo : list) {
                    String str4 = consentInfo.key;
                    if (C123100dR.LIZ(str4) && str4 != null) {
                        int iIntValue = num2.intValue();
                        String str5 = consentInfo.collectionFlow;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = consentInfo.collectionPoint;
                        if (str6 == null) {
                            str6 = "";
                        }
                        arrayList2.add(new C1887750zDx(str4, iIntValue, str5, str6));
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IComplianceDependencyService.class.getName();
                        if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
                    }
                    ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).updatePNSConsentStatus(arrayList2, "order_submit_privacy_popup", true, new C854503Vn(this, str, jCurrentTimeMillis, jSONObject));
                    int value3 = EnumC854703Vp.CLOSE.getValue();
                    if (num != null && num.intValue() == value3) {
                        str2 = "close";
                    } else {
                        int value4 = EnumC854703Vp.ACCEPT.getValue();
                        if (num == null || num.intValue() != value4) {
                            return;
                        } else {
                            str2 = "agree";
                        }
                    }
                    String str7 = privacyPopup.daInfo;
                    if (str7 != null) {
                        mapLJIIJ = C1741890vQh.LJIIJ(str7);
                    }
                    C03O0.LJJLIIIJ(C03O0.LIZ, "terms_update_notice", str2, null, null, mapLJIIJ, null, true, 44);
                    return;
                }
            }
            ((InterfaceC854803Vq) this.LIZJ.getValue()).LIZJ(str, EnumC854603Vo.CONSENT_RECORDS_EMPTY, jSONObject);
            return;
        }
        ((InterfaceC854803Vq) this.LIZJ.getValue()).LIZJ(str, EnumC854603Vo.ACTION_TYPE_INVALID, jSONObject);
    }
}
