package X;

import android.app.Activity;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1Avo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195221Avo {
    public static WeakReference<Activity> LIZ;
    public static WeakReference<MiniGameFragment> LIZIZ;
    public static WeakReference<InterfaceC1395520mQ2> LIZJ;
    public static WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> LIZLLL;
    public static WeakReference<IMiniGameRuntimeAPI> LJ;
    public static WeakReference<AnonymousClass1521> LJFF;
    public static WeakReference<C2195011AvT> LJI;
    public static SchemaParserData LJII;
    public static String LJIIIIZZ;
    public static C2196371Axf LJIIIZ;
    public static MinisMetaResp LJIIJ;
    public static C1B08 LJIIJJI;
    public static C1048270dNx LJIIL;

    public static String LIZ() {
        SchemaParserData schemaParserData = LJII;
        if (schemaParserData != null) {
            return schemaParserData.clientKey;
        }
        return null;
    }

    public static MiniGameFragment LIZIZ() {
        WeakReference<MiniGameFragment> weakReference = LIZIZ;
        MiniGameFragment miniGameFragment = weakReference != null ? weakReference.get() : null;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecentMiniGameFragmentInstance, instance:");
        sbLIZ.append(miniGameFragment);
        C2188811AlT.LIZIZ(sbLIZ);
        return miniGameFragment;
    }

    public static C2195011AvT LIZJ() {
        WeakReference<C2195011AvT> weakReference = LJI;
        C2195011AvT c2195011AvT = weakReference != null ? weakReference.get() : null;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecentMiniGameRenderInstance, instance:");
        sbLIZ.append(c2195011AvT);
        C2188811AlT.LIZIZ(sbLIZ);
        return c2195011AvT;
    }

    public static Activity LIZLLL() {
        WeakReference<Activity> weakReference = LIZ;
        Activity activity = weakReference != null ? weakReference.get() : null;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecentMinisActivity, activity:");
        sbLIZ.append(activity);
        C2188811AlT.LIZIZ(sbLIZ);
        return activity;
    }

    public static AnonymousClass1521 LJ() {
        WeakReference<AnonymousClass1521> weakReference = LJFF;
        AnonymousClass1521 anonymousClass1521 = weakReference != null ? weakReference.get() : null;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecentMinisDebugRuntimeInstance, instance:");
        sbLIZ.append(anonymousClass1521);
        C2188811AlT.LIZIZ(sbLIZ);
        return anonymousClass1521;
    }

    public static InterfaceC1395520mQ2 LJFF() {
        WeakReference<InterfaceC1395520mQ2> weakReference = LIZJ;
        InterfaceC1395520mQ2 interfaceC1395520mQ2 = weakReference != null ? weakReference.get() : null;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecentMinisScreenProtection, instance:");
        sbLIZ.append(interfaceC1395520mQ2);
        C2188811AlT.LIZIZ(sbLIZ);
        return interfaceC1395520mQ2;
    }

    public static IMiniGameRuntimeAPI LJI() {
        WeakReference<IMiniGameRuntimeAPI> weakReference = LJ;
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI = weakReference != null ? weakReference.get() : null;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecentNativeGameRuntimeInstance, instance:");
        sbLIZ.append(iMiniGameRuntimeAPI);
        C2188811AlT.LIZIZ(sbLIZ);
        return iMiniGameRuntimeAPI;
    }

    public static SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJII() {
        WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> weakReference = LIZLLL;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = weakReference != null ? weakReference.get() : null;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecentSparkViewInstance, instance:");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        C2188811AlT.LIZIZ(sbLIZ);
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    public static void LJIIIIZZ(Activity activity) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisActivityCreated, activity:");
        sbLIZ.append(activity);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZ = new WeakReference<>(activity);
    }

    public static void LJIIIZ(IMiniGameRuntimeAPI iMiniGameRuntimeAPI) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNativeGameRuntimeInstanceCreated, nativeGameRuntime:");
        sbLIZ.append(iMiniGameRuntimeAPI);
        C2188811AlT.LIZIZ(sbLIZ);
        LJ = new WeakReference<>(iMiniGameRuntimeAPI);
    }

    public static void LJIIJ(InterfaceC1395520mQ2 interfaceC1395520mQ2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScreenProtectionCreated, screenProtection:");
        sbLIZ.append(interfaceC1395520mQ2);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZJ = new WeakReference<>(interfaceC1395520mQ2);
    }

    public static void LJIIJJI(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSparkViewInstanceCreated, view:");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZLLL = new WeakReference<>(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
    }

    public static void LJIIL(C2196371Axf c2196371Axf) {
        LJIIIZ = c2196371Axf;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCurrentPerfModel, data:");
        sbLIZ.append(c2196371Axf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIILIIL(SchemaParserData schemaParserData) {
        LJII = schemaParserData;
        String str = null;
        LJIIL = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCurrentSchemaData, data:");
        sbLIZ.append(schemaParserData);
        sbLIZ.append(", clientKey:");
        if (schemaParserData != null) {
            str = schemaParserData.clientKey;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
