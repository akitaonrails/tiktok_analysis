package X;

import Y.ARunnableS92S0200000_23;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.lynx.tasm.LynxView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qEG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541980qEG extends AbstractC1542020qEK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        ViewParent parent;
        final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C1537910q7h c1537910q7h;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        View viewE1;
        InterfaceC1542010qEJ interfaceC1542010qEJ = (InterfaceC1542010qEJ) xBaseParamModel;
        String schema = interfaceC1542010qEJ.getSchema();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String str = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        String containerID2 = interfaceC1542010qEJ.getContainerID();
        if (containerID2 != null) {
            containerID = containerID2;
        }
        SparkContext.Companion.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (interfaceC1541990qEHLJIJJ = c1537480q70LIZIZ.LJIJJ()) != null && (viewE1 = interfaceC1541990qEHLJIJJ.e1()) != null) {
            parent = viewE1.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) parent;
        } else {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
        }
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
            completionBlock.onFailure(0, "cannot find spark", (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1542300qEm.class, null));
            return;
        }
        boolean showLoading = interfaceC1542010qEJ.getShowLoading();
        Map<String, Object> extra = interfaceC1542010qEJ.getExtra();
        final AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(completionBlock, (CompletionBlock<InterfaceC1542300qEm>) 184);
        final AwS602S0100000_23 awS602S0100000_23 = new AwS602S0100000_23(completionBlock, (CompletionBlock<InterfaceC1504490pFn>) 75);
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZLL;
        if (sparkContext != null) {
            str = sparkContext.containerId;
        }
        SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZLL;
        if (sparkContext2 != null) {
            sparkContext2.LJJI();
            sparkContext2.LJJIIZ(schema);
            if (extra != null) {
                sparkContext2.LJJLI(extra);
            }
            sparkContext2.hasParseSchema = false;
            C1529830puf c1529830puf = C1537480q70.Companion;
            String str2 = sparkContext2.containerId;
            c1529830puf.getClass();
            C1529830puf.LIZJ(sparkContext2, str2);
            if (str != null) {
                C1529830puf.LIZLLL(str);
            }
            InterfaceC1531560pxS interfaceC1531560pxS = sparkContext2.hybridParams;
            if (interfaceC1531560pxS instanceof C1537910q7h) {
                c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
                c1537910q7h.LJI(UriProtector.parse(schema));
            } else {
                c1537910q7h = new C1537910q7h(UriProtector.parse(schema));
            }
            sparkContext2.hybridParams = c1537910q7h;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJJJ = !showLoading;
            HybridSchemaParam hybridSchemaParamLJJJI = sparkContext2.LJJJI(-1);
            if (hybridSchemaParamLJJJI == null) {
                hybridSchemaParamLJJJI = new HybridSchemaParam(EnumC1067640dtC.LYNX);
            }
            final InterfaceC1541990qEH interfaceC1541990qEH = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZIL;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.setKitViewDelegate(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIJJLI(hybridSchemaParamLJJJI, sparkContext2, sparkContext2, new AbstractC1537870q7d() { // from class: X.0qEI
                @Override // X.AbstractC1537870q7d
                public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH2) {
                    View viewE12;
                    View viewE13;
                    LynxView lynxView;
                    if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                        HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, new ARunnableS92S0200000_23(interfaceC1541990qEH, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, 133));
                    } else {
                        InterfaceC1541990qEH interfaceC1541990qEH3 = interfaceC1541990qEH;
                        if (interfaceC1541990qEH3 != null && (viewE13 = interfaceC1541990qEH3.e1()) != null) {
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                            if ((viewE13 instanceof LynxView) && (lynxView = (LynxView) viewE13) != null) {
                                lynxView.destroy();
                            }
                            C786410Ut5.LJJLIIIIJ(viewE13, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3);
                        }
                        InterfaceC1541990qEH interfaceC1541990qEH4 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZIL;
                        if (interfaceC1541990qEH4 != null && (viewE12 = interfaceC1541990qEH4.e1()) != null) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.addView(viewE12, new FrameLayout.LayoutParams(-1, -1));
                        }
                    }
                    awS567S0100000_23.invoke();
                }

                @Override // X.AbstractC1537870q7d
                public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH2, String str3, C1542120qEU c1542120qEU) {
                    Function1<String, Unit> function1 = awS602S0100000_23;
                    String str4 = c1542120qEU.LIZIZ;
                    if (str4 == null) {
                        str4 = "load failed, unknown reason";
                    }
                    function1.invoke(str4);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super((Object) null);
                }
            }));
            InterfaceC1541990qEH interfaceC1541990qEH2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZIL;
            if (interfaceC1541990qEH2 == null) {
                return;
            }
            interfaceC1541990qEH2.load();
            return;
        }
        awS602S0100000_23.invoke("sparkContext is null");
    }
}
