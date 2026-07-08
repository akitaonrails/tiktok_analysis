package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiSlashPreload;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS31S0200100_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hZH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1209050hZH extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(5);
    public final int $t;

    public static C1209050hZH get$arr$(int i) {
        C1209050hZH c1209050hZH = (C1209050hZH) arr$.get(i);
        if (c1209050hZH != null) {
            return c1209050hZH;
        }
        arr$.compareAndSet(i, null, new C1209050hZH(i));
        return (C1209050hZH) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209050hZH(int i) {
        super(4);
        this.$t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(C1209050hZH c1209050hZH, Object obj, Object obj2, Object obj3, Object obj4) {
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        Activity activity;
        InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) obj;
        Object obj5 = (InterfaceC214902198i) obj2;
        Bundle bundle = (Bundle) obj3;
        String str = (String) obj4;
        Unit unit = null;
        if (interfaceC214902198i != null && (sAFFragmentRootSceneIb = interfaceC214902198i.ib()) != null && (activity = sAFFragmentRootSceneIb.mActivity) != null) {
            C20152713tF.LIZ.getClass();
            if (C297190Bkr.LIZ()) {
                if (bundle != null) {
                    bundle.putLong("EXTRA_PRELOAD_PAGE_START_TIME", SystemClock.elapsedRealtime());
                }
                try {
                    C20152913tH.LIZLLL.getClass();
                    C20152113t9 c20152113t9LIZIZ = C20153113tJ.LIZIZ();
                    if (c20152113t9LIZIZ != 0) {
                        c20152113t9LIZIZ.LJ(str, activity.getClass(), ((Fragment) obj5).getClass(), bundle);
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            return Unit.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no activity for ");
        sbLIZ.append(interfaceC214902198i);
        sbLIZ.append(" when navigating.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final Object invoke$1(C1209050hZH c1209050hZH, Object obj, Object obj2, Object obj3, Object obj4) {
        C1192290h8F.LIZJ((AbstractC738140SxQ) obj, new AwS597S0100000_18((Integer) obj4, 520));
        return Unit.LIZ;
    }

    public static final Object invoke$2(C1209050hZH c1209050hZH, Object obj, Object obj2, Object obj3, Object obj4) {
        Bundle bundle = (Bundle) obj3;
        String str = (String) obj4;
        C1188750h2X.LIZ.getClass();
        if (C297190Bkr.LIZ() && str != null && a0.LJJIIZI(str, "aweme://saf/poi/detail", false)) {
            if (bundle != null) {
                bundle.putLong("EXTRA_PRELOAD_PAGE_START_TIME", SystemClock.elapsedRealtime());
            }
            C1188840h2g.LIZ();
            C20152913tH.LIZLLL.getClass();
            C20152113t9 c20152113t9LIZIZ = C20153113tJ.LIZIZ();
            if (c20152113t9LIZIZ != null) {
                c20152113t9LIZIZ.LIZLLL(bundle, PoiSlashPreload.class);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C1209050hZH c1209050hZH, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!C1202010hNv.LJ) {
            C1202010hNv.LJ = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C1209050hZH c1209050hZH, Object obj, Object obj2, Object obj3, Object obj4) {
        EnumC1201990hNt enumC1201990hNt = (EnumC1201990hNt) obj;
        Function1 function1 = (Function1) obj2;
        Function1 function12 = (Function1) obj3;
        Function1 function13 = (Function1) obj4;
        C1202010hNv c1202010hNv = C1202010hNv.LIZ;
        List<String> list = (List) ((LinkedHashMap) C1202010hNv.LIZJ).get(enumC1201990hNt);
        c1202010hNv.getClass();
        if (list != null) {
            Map<EnumC1201990hNt, List<String>> map = C1202010hNv.LIZLLL;
            if (!Intrinsics.LJFF(((LinkedHashMap) map).get(enumC1201990hNt), list)) {
                map.put(enumC1201990hNt, list);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C1202120hO6 c1202120hO6 = new Object() { // from class: X.0hO6
                };
                final AwS31S0200100_18 awS31S0200100_18 = new AwS31S0200100_18(jElapsedRealtime, (long) enumC1201990hNt, (EnumC1201990hNt) function1, (Function1<? super String, Unit>) 2);
                final AwS31S0200100_18 awS31S0200100_182 = new AwS31S0200100_18(jElapsedRealtime, (long) enumC1201990hNt, (EnumC1201990hNt) function12, (Function1<? super String, Unit>) 3);
                final AwS31S0200100_18 awS31S0200100_183 = new AwS31S0200100_18(jElapsedRealtime, (long) enumC1201990hNt, (EnumC1201990hNt) function13, (Function1<? super String, Unit>) 4);
                c1202120hO6.getClass();
                String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
                C1537050q6J.LIZ.getClass();
                C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
                HashMap map2 = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
                    targetChannel.channelName = str;
                    arrayList.add(targetChannel);
                }
                if (!arrayList.isEmpty()) {
                    map2.put(accessKey, arrayList);
                    OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                    optionCheckUpdateParams.setEnableThrottle(true);
                    optionCheckUpdateParams.setEnableRetry(true);
                    optionCheckUpdateParams.setListener(new AbstractC1552040qUU() { // from class: X.0hO5
                        @Override // X.AbstractC1552040qUU
                        public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                            Function1<String, Unit> function14 = awS31S0200100_182;
                            if (function14 != null) {
                                String channel = localPackageModel.getChannel();
                                if (channel == null) {
                                    channel = "";
                                }
                                function14.invoke(channel);
                            }
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                            String channel;
                            Function1<String, Unit> function14 = awS31S0200100_183;
                            if (function14 != null) {
                                if (updatePackage == null || (channel = updatePackage.getChannel()) == null) {
                                    channel = "";
                                }
                                function14.invoke(channel);
                            }
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJIL(long j, UpdatePackage updatePackage) {
                            String channel;
                            Function1<String, Unit> function14 = awS31S0200100_18;
                            if (function14 != null) {
                                if (updatePackage == null || (channel = updatePackage.getChannel()) == null) {
                                    channel = "";
                                }
                                function14.invoke(channel);
                            }
                        }
                    });
                    if (c1551950qULLIZ != null) {
                        c1551950qULLIZ.LIZ("default", map2, optionCheckUpdateParams);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
