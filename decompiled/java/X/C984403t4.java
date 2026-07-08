package X;

import Y.ARunnableS70S0200000_1;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03t4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C984403t4 {
    public final AddressSelectViewModel LIZ;
    public final View LIZIZ;
    public boolean LIZJ;
    public String LIZLLL = "";
    public int LJ;
    public boolean LJFF;

    public final void LJI() {
        this.LIZJ = false;
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_zipcode_locate_address", C1741890vQh.LJIIIIZZ(new ZipcodeLocateAddress(-1, null, null, null, null, null)));
    }

    public static void LIZJ(C0I7D c0i7d) {
        IECommerceHostService iECommerceHostService;
        InputMethodManager inputMethodManager;
        boolean z;
        try {
            String name = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                if (iECommerceHostService2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            Object objH2 = C786410Ut5.H2(((IApplicationDependencyService) iECommerceHostService).getApplicationContext(), "input_method");
            if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                inputMethodManager.hideSoftInputFromWindow(c0i7d.getWindowToken(), 0);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GECC EditText closekeybord(), ");
            sbLIZ.append(e);
            C1AF0.LJ(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public final void LIZ(C0I7D c0i7d) {
        List<ReachableAddress> list;
        DeliveryData deliveryData = this.LIZ.LLIZ;
        if (deliveryData != null) {
            list = deliveryData.addresses;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            C973303rH.LL.getClass();
            String str = C973303rH.LLILZIL;
            if ((str == null || str.length() == 0) && c0i7d != null) {
                HandlerHook.viewPostDelay(c0i7d, new ARunnableS70S0200000_1(c0i7d, this, 37), 200L);
            }
        }
    }

    public C984403t4(AddressSelectViewModel addressSelectViewModel, View view) {
        this.LIZ = addressSelectViewModel;
        this.LIZIZ = view;
    }

    public static void LJ(C1748470vbJ c1748470vbJ, ChangeLocationData changeLocationData) {
        String str;
        Integer num;
        Integer num2;
        int iIntValue;
        if (c1748470vbJ != null) {
            if (changeLocationData != null) {
                str = changeLocationData.zipcodePlaceHolderHint;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                c1748470vbJ.LJIIJ(str);
            }
            if (changeLocationData != null && (num2 = changeLocationData.zipcodeMaxLength) != null && (iIntValue = num2.intValue()) > 0) {
                c1748470vbJ.LJIIIIZZ(iIntValue);
            }
            c1748470vbJ.LL.setLines(1);
            c1748470vbJ.LJFF(false);
            if (changeLocationData != null && (num = changeLocationData.zipcodeKeyboardType) != null) {
                int iIntValue2 = num.intValue();
                if (iIntValue2 != 1) {
                    if (iIntValue2 == 2) {
                        c1748470vbJ.LJII(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                        return;
                    }
                    return;
                }
                c1748470vbJ.LJII(2);
            }
        }
    }

    public final void LIZIZ(C1748470vbJ c1748470vbJ, InterfaceC984903t9 interfaceC984903t9) throws Throwable {
        Region region;
        if (C703302op.LIZ(interfaceC984903t9.LIZIZ())) {
            C03FA.LIZLLL("apply", "next", null, null, null, null, "choose_your_location", null);
            if (c1748470vbJ != null) {
                LIZJ(c1748470vbJ.getEditText());
                c1748470vbJ.LJIILJJIL(true);
            }
            if (!this.LIZJ) {
                this.LIZJ = true;
                AddressSelectViewModel addressSelectViewModel = this.LIZ;
                String strLIZIZ = interfaceC984903t9.LIZIZ();
                addressSelectViewModel.getClass();
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new AddressItem("zipcode", strLIZIZ));
                    ChangeLocationData changeLocationDataLR2 = addressSelectViewModel.lR2();
                    if (changeLocationDataLR2 != null) {
                        region = changeLocationDataLR2.region;
                    } else {
                        region = null;
                    }
                    C948503nH.LJFF(addressSelectViewModel, C23271099x.INSTANCE, new C980603sS(new Address(null, arrayList, region, null, null, null, null, null, null, null, null, null), strLIZIZ, addressSelectViewModel, false, null));
                    return;
                }
                return;
            }
            this.LIZ.pR2(interfaceC984903t9.LIZIZ());
        }
    }

    public final void LJFF(String str, boolean z) {
        int length;
        boolean zLJFF = Intrinsics.LJFF(this.LIZLLL, "sug");
        boolean zLJFF2 = Intrinsics.LJFF(this.LIZLLL, "auto");
        if (str != null) {
            length = str.length();
        } else {
            length = 0;
        }
        int i = length - this.LJ;
        if (i < 0) {
            this.LIZLLL = "del";
        } else if (i > 0) {
            this.LIZLLL = "add";
        } else if (!zLJFF && !zLJFF2) {
            this.LIZLLL = "";
        }
        C1748720vbi.LIZLLL(this.LIZIZ, new C04CK() { // from class: X.048E
            @Override // X.AbstractC1748790vbp
            public final C1748850vbv LIZ() {
                return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("entrance_info", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("sub_page_name", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS[0]), new C1748840vbu("input_box_name", new C1747940vaS[0]), new C1748840vbu("stay_time", new C1747940vaS[0]), new C1748840vbu("input_method", new C1747940vaS[0]), new C1748840vbu("has_normal_input", new C1747940vaS[0]), new C1748840vbu("has_auto_input", new C1747940vaS[0]), new C1748840vbu("has_sug_input", new C1747940vaS[0]), new C1748840vbu("is_valid", new C1747940vaS[0]));
            }
        }, new C984603t6(this, zLJFF2, zLJFF, z));
    }

    public final void LIZLLL(final C1748470vbJ c1748470vbJ, final InterfaceC984903t9 interfaceC984903t9, final Function1<? super Boolean, Unit> function1) {
        Region region;
        int length;
        if (c1748470vbJ != null) {
            if (C703302op.LIZ(interfaceC984903t9.LIZIZ())) {
                ChangeLocationData changeLocationDataLR2 = this.LIZ.lR2();
                if (changeLocationDataLR2 != null) {
                    region = changeLocationDataLR2.region;
                } else {
                    region = null;
                }
                if (!C1745180vW0.LJI(region)) {
                    this.LIZLLL = "auto";
                    String strLIZIZ = interfaceC984903t9.LIZIZ();
                    if (strLIZIZ != null) {
                        length = strLIZIZ.length();
                    } else {
                        length = 0;
                    }
                    this.LJ = length;
                    c1748470vbJ.LJIILIIL(interfaceC984903t9.LIZIZ());
                }
            }
            c1748470vbJ.LIZIZ(new TextWatcher() { // from class: X.03t7
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    this.LL.LJI();
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    Region region2;
                    boolean z = false;
                    c1748470vbJ.LJI(false);
                    if (charSequence != null) {
                        InterfaceC984903t9 interfaceC984903t92 = interfaceC984903t9;
                        C984403t4 c984403t4 = this.LL;
                        interfaceC984903t92.LIZ(a0.LJLIIIL(charSequence.toString()).toString());
                        ChangeLocationData changeLocationDataLR22 = c984403t4.LIZ.lR2();
                        if (changeLocationDataLR22 != null) {
                            region2 = changeLocationDataLR22.region;
                        } else {
                            region2 = null;
                        }
                        if (!C1745180vW0.LJI(region2)) {
                            AddressSelectViewModel addressSelectViewModel = c984403t4.LIZ;
                            if (charSequence.length() == 0) {
                                z = true;
                            }
                            addressSelectViewModel.getClass();
                            addressSelectViewModel.setState(new AwS89S0110000_1(!z, (Integer) 1, 31));
                        }
                    }
                }
            });
            final C0I7D editText = c1748470vbJ.getEditText();
            if (editText != null) {
                editText.setImeOptions(6);
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.03t8
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) throws Throwable {
                        if (i == 6) {
                            C984403t4 c984403t4 = this.LL;
                            C0I7D c0i7d = editText;
                            c984403t4.getClass();
                            C984403t4.LIZJ(c0i7d);
                            editText.clearFocus();
                            this.LL.LIZIZ(c1748470vbJ, interfaceC984903t9);
                            return true;
                        }
                        return false;
                    }
                });
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.03t5
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        int length2;
                        function1.invoke(Boolean.valueOf(z));
                        if (z) {
                            C984403t4 c984403t4 = this;
                            c984403t4.LJFF = true;
                            AddressSelectViewModel addressSelectViewModel = c984403t4.LIZ;
                            boolean zLIZ = C123100dR.LIZ(interfaceC984903t9.LIZIZ());
                            addressSelectViewModel.getClass();
                            addressSelectViewModel.setState(new AwS89S0110000_1(zLIZ, (Integer) 1, 31));
                            C984403t4 c984403t42 = this;
                            C1748720vbi.LIZLLL(c984403t42.LIZIZ, new C04CK() { // from class: X.048O
                                @Override // X.AbstractC1748790vbp
                                public final C1748850vbv LIZ() {
                                    return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("entrance_info", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("sub_page_name", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS[0]), new C1748840vbu("input_box_name", new C1747940vaS[0]));
                                }
                            }, new AwS580S0100000_1(c984403t42, 1129));
                            C984403t4 c984403t43 = this;
                            String strLIZIZ2 = interfaceC984903t9.LIZIZ();
                            if (strLIZIZ2 != null) {
                                length2 = strLIZIZ2.length();
                            } else {
                                length2 = 0;
                            }
                            c984403t43.LJ = length2;
                            C984403t4 c984403t44 = this;
                            c984403t44.getClass();
                            c984403t44.LJI();
                            return;
                        }
                        C984403t4 c984403t45 = this;
                        C0I7D c0i7d = editText;
                        c984403t45.getClass();
                        C984403t4.LIZJ(c0i7d);
                    }
                });
            }
        }
    }
}
