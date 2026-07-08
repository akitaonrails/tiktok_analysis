package androidx.lifecycle;

import X.C1617800sCY;
import X.C19719512Dh;
import X.C2277071EAv;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.main.lancet.KtSafLancet$SAFRetainedKeysViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes25.dex */
public class ViewModelStore {
    public final Map<String, ViewModel> map = new LinkedHashMap();

    public final void clear() {
        androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_main_lancet_KtSafLancet_clear(this);
    }

    public final ViewModel get(String str) {
        return androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_get(this, str);
    }

    public final Set keys() {
        return androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_keys(this);
    }

    public final void put(String str, ViewModel viewModel) {
        androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_put(this, str, viewModel);
    }

    public final void androidx_lifecycle_ViewModelStore__clear$___twin___() {
        Iterator<ViewModel> it2 = this.map.values().iterator();
        while (it2.hasNext()) {
            it2.next().clear$lifecycle_viewmodel_release();
        }
        this.map.clear();
    }

    public final Set<String> androidx_lifecycle_ViewModelStore__keys$___twin___() {
        return new HashSet(this.map.keySet());
    }

    public static void androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_clear(ViewModelStore viewModelStore) {
        if (((Boolean) C2277071EAv.LJFF.getValue()).booleanValue()) {
            System.err.println(Log.getStackTraceString(new Exception(viewModelStore.toString())));
        }
        if (C2277071EAv.LIZIZ()) {
            synchronized (viewModelStore.map) {
                try {
                    if (((Boolean) C2277071EAv.LIZLLL.getValue()).booleanValue()) {
                        try {
                            viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (((Boolean) C2277071EAv.LJ.getValue()).booleanValue()) {
                                try {
                                    viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                        }
                        return;
                    }
                    viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
                    return;
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
        }
        if (((Boolean) C2277071EAv.LIZLLL.getValue()).booleanValue()) {
            try {
                viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
                return;
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                if (((Boolean) C2277071EAv.LJ.getValue()).booleanValue()) {
                    try {
                        viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
                        return;
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                        return;
                    }
                }
                return;
            }
        }
        viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
    }

    public static Set androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_keys(ViewModelStore viewModelStore) {
        Set<String> setAndroidx_lifecycle_ViewModelStore__keys$___twin___;
        if (C2277071EAv.LIZIZ()) {
            synchronized (viewModelStore.map) {
                try {
                    setAndroidx_lifecycle_ViewModelStore__keys$___twin___ = viewModelStore.androidx_lifecycle_ViewModelStore__keys$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return setAndroidx_lifecycle_ViewModelStore__keys$___twin___;
        }
        return viewModelStore.androidx_lifecycle_ViewModelStore__keys$___twin___();
    }

    public static void androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_main_lancet_KtSafLancet_clear(ViewModelStore viewModelStore) {
        List<String> arrayList;
        KtSafLancet$SAFRetainedKeysViewModel ktSafLancet$SAFRetainedKeysViewModel;
        if (((Boolean) C1617800sCY.LIZJ.getValue()).booleanValue()) {
            ViewModel viewModel = viewModelStore.get("saf_retained_keys_when_clear_view_model");
            if (!(viewModel instanceof KtSafLancet$SAFRetainedKeysViewModel) || (ktSafLancet$SAFRetainedKeysViewModel = (KtSafLancet$SAFRetainedKeysViewModel) viewModel) == null || (arrayList = ktSafLancet$SAFRetainedKeysViewModel.LL) == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.isEmpty()) {
                Map mapLIZJ = C19719512Dh.LIZJ(viewModelStore.map);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : arrayList) {
                    ViewModel viewModel2 = viewModelStore.get(str);
                    if (viewModel2 != null) {
                        linkedHashMap.put(str, viewModel2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    mapLIZJ.remove(it2.next());
                }
                arrayList.clear();
                androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_clear(viewModelStore);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    viewModelStore.put((String) entry.getKey(), (ViewModel) entry.getValue());
                }
                return;
            }
            androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_clear(viewModelStore);
            return;
        }
        androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_clear(viewModelStore);
    }

    public final ViewModel androidx_lifecycle_ViewModelStore__get$___twin___(String str) {
        return this.map.get(str);
    }

    public static ViewModel androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_get(ViewModelStore viewModelStore, String str) {
        ViewModel viewModelAndroidx_lifecycle_ViewModelStore__get$___twin___;
        if (C2277071EAv.LIZIZ()) {
            synchronized (viewModelStore.map) {
                try {
                    viewModelAndroidx_lifecycle_ViewModelStore__get$___twin___ = viewModelStore.androidx_lifecycle_ViewModelStore__get$___twin___(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return viewModelAndroidx_lifecycle_ViewModelStore__get$___twin___;
        }
        return viewModelStore.androidx_lifecycle_ViewModelStore__get$___twin___(str);
    }

    public final void androidx_lifecycle_ViewModelStore__put$___twin___(String str, ViewModel viewModel) {
        ViewModel viewModelPut = this.map.put(str, viewModel);
        if (viewModelPut != null) {
            viewModelPut.clear$lifecycle_viewmodel_release();
        }
    }

    public static void androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_put(ViewModelStore viewModelStore, String str, ViewModel viewModel) {
        if (((Boolean) C2277071EAv.LJFF.getValue()).booleanValue()) {
            System.err.println(Log.getStackTraceString(new Exception(viewModelStore.toString())));
        }
        if (C2277071EAv.LIZIZ()) {
            synchronized (viewModelStore.map) {
                try {
                    viewModelStore.androidx_lifecycle_ViewModelStore__put$___twin___(str, viewModel);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        viewModelStore.androidx_lifecycle_ViewModelStore__put$___twin___(str, viewModel);
    }
}
