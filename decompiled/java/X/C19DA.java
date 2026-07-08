package X;

import Y.ARunnableS132S0100000_32;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.foundation.activity.BaseActivity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19DA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19DA {
    public static C1AMU LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(Context context, boolean z) {
        C06W3 c06w3;
        C06W3 next;
        if (context instanceof BaseActivity) {
            if (!z) {
                C823050WQl.LIZLLL().execute(new ARunnableS132S0100000_32(context, 51));
            } else {
                C823050WQl.LIZLLL().execute(new ARunnableS132S0100000_32(context, 52));
            }
            C19DB c19db = (C19DB) context;
            Map<Class<?>, MutableLiveData<C06W3>> map = c19db.provideBaseViewModel().wQ2().LIZ;
            if (!map.containsKey(C721340SRg.class)) {
                map.put(C721340SRg.class, new MutableLiveData<>());
            }
            if (map.containsKey(C721340SRg.class)) {
                LiveData mutableLiveData = (LiveData) ((LinkedHashMap) map).get(C721340SRg.class);
                if (mutableLiveData == null) {
                    mutableLiveData = new MutableLiveData();
                    map.put(C721340SRg.class, (MutableLiveData<C06W3>) mutableLiveData);
                }
                C21152317q5 c21152317q5VQ2 = c19db.provideBaseViewModel().vQ2();
                Object obj = (C06W3) mutableLiveData.getValue();
                if (obj == null) {
                    Iterator<C06W3> it2 = c21152317q5VQ2.LIZ().iterator();
                    while (true) {
                        c06w3 = null;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next instanceof C721340SRg) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (next instanceof C721340SRg) {
                        c06w3 = next;
                    }
                    obj = (C721340SRg) c06w3;
                    if (obj == null && (obj = (C06W3) C721340SRg.class.newInstance()) == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.activity.processor.AudioConfig");
                    }
                }
                C721340SRg c721340SRg = new C721340SRg(z);
                c21152317q5VQ2.LIZIZ(c721340SRg);
                if (!obj.equals(c721340SRg)) {
                    if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                        mutableLiveData.setValue(c721340SRg);
                    } else {
                        mutableLiveData.postValue(c721340SRg);
                    }
                }
            }
        }
    }
}
