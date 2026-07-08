package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J7R, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J7R implements C0J7X {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(162));

    @Override // X.C0J7X
    public final void LIZ(String str, Observer<Pair<Long, SlimRoom>> observer) {
        C0J7S next;
        C0J7Q c0j7q = (C0J7Q) this.LIZ.getValue();
        Iterator<C0J7S> it2 = c0j7q.LJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(observer, next.LL.get())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0J7S c0j7s = next;
        if (c0j7s != null) {
            c0j7q.LJ.remove(c0j7s);
            MutableLiveData<C0J7T> mutableLiveData = c0j7q.LIZ.get(str);
            if (mutableLiveData != null) {
                mutableLiveData.removeObserver(c0j7s);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove observer: ");
            sbLIZ.append(str);
            C0J7M.LIZ("UserLiveRoomDataCenter", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.C0J7X
    public final void LIZIZ(C19EG c19eg, Lifecycle.State state) {
        if (c19eg == null) {
            return;
        }
        ((C0J7Q) this.LIZ.getValue()).LIZIZ(c19eg, state);
    }

    @Override // X.C0J7X
    public final void LIZJ(String str, LifecycleOwner lifecycleOwner, Observer<Pair<Long, SlimRoom>> observer) {
        C0J7T value;
        C0J7T value2;
        MutableLiveData<C0J7T> mutableLiveDataPutIfAbsent;
        boolean z;
        C0J7T value3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerAndObserveLiveRoomChanged, uid:");
        sbLIZ.append(str);
        C0J7M.LIZIZ("UserLiveRoomRepoService", C2188811AlT.LIZIZ(sbLIZ));
        Long lValueOf = null;
        boolean z2 = true;
        long j = 0;
        if (((Boolean) C292950Be1.LIZ.getValue()).booleanValue()) {
            C0J7Q c0j7q = (C0J7Q) this.LIZ.getValue();
            c0j7q.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            MutableLiveData<C0J7T> mutableLiveData = c0j7q.LIZ.get(str);
            if (mutableLiveData != null && (value3 = mutableLiveData.getValue()) != null) {
                j = value3.LIZIZ;
            }
            if (jCurrentTimeMillis - j > 21600000) {
                z = true;
            } else {
                z = false;
            }
            if (c0j7q.LIZ.containsKey(str) && !z) {
                MutableLiveData<C0J7T> mutableLiveData2 = c0j7q.LIZ.get(str);
                if (mutableLiveData2 != null) {
                    mutableLiveData2.getValue();
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("no cache for uid: ");
                sbLIZ2.append(str);
                C0J7M.LIZIZ("UserLiveRoomDataCenter", C2188811AlT.LIZIZ(sbLIZ2));
                C05CO c05co = c0j7q.LIZJ;
                if (z || !c05co.LIZ.contains(str)) {
                    c05co.LIZ.add(str);
                    AnonymousClass0956 anonymousClass0956 = c05co.LIZIZ;
                    if (anonymousClass0956 == null || anonymousClass0956.isCompleted()) {
                        c05co.LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05CM(c05co, null), 3);
                    }
                }
            }
        } else {
            C0J7Q c0j7q2 = (C0J7Q) this.LIZ.getValue();
            c0j7q2.getClass();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            MutableLiveData<C0J7T> mutableLiveData3 = c0j7q2.LIZ.get(str);
            if (mutableLiveData3 != null && (value2 = mutableLiveData3.getValue()) != null) {
                j = value2.LIZIZ;
            }
            if (jCurrentTimeMillis2 - j <= 300000) {
                z2 = false;
            }
            if (c0j7q2.LIZ.containsKey(str) && !z2) {
                MutableLiveData<C0J7T> mutableLiveData4 = c0j7q2.LIZ.get(str);
                if (mutableLiveData4 != null) {
                    mutableLiveData4.getValue();
                }
            } else {
                c0j7q2.LIZIZ.LIZIZ(str);
                if (c0j7q2.LIZ.containsKey(str) && z2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("the cache is invalid，lastTime:");
                    MutableLiveData<C0J7T> mutableLiveData5 = c0j7q2.LIZ.get(str);
                    if (mutableLiveData5 != null && (value = mutableLiveData5.getValue()) != null) {
                        lValueOf = Long.valueOf(value.LIZIZ);
                    }
                    sbLIZ3.append(lValueOf);
                    C0J7M.LIZ("UserLiveRoomDataCenter", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        final C0J7Q c0j7q3 = (C0J7Q) this.LIZ.getValue();
        c0j7q3.getClass();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("observeLiveRoomChangedSticky:");
        sbLIZ4.append(str);
        sbLIZ4.append("  ");
        sbLIZ4.append(lifecycleOwner.hashCode());
        sbLIZ4.append(' ');
        sbLIZ4.append(c0j7q3.hashCode());
        C0J7M.LIZ("UserLiveRoomDataCenter", C2188811AlT.LIZIZ(sbLIZ4));
        final C0J7S c0j7s = new C0J7S(observer);
        c0j7q3.LJ.add(c0j7s);
        ConcurrentHashMap<String, MutableLiveData<C0J7T>> concurrentHashMap = c0j7q3.LIZ;
        MutableLiveData<C0J7T> mutableLiveData6 = concurrentHashMap.get(str);
        if (mutableLiveData6 == null && (mutableLiveDataPutIfAbsent = concurrentHashMap.putIfAbsent(str, (mutableLiveData6 = new MutableLiveData<>()))) != null) {
            mutableLiveData6 = mutableLiveDataPutIfAbsent;
        }
        mutableLiveData6.observe(lifecycleOwner, c0j7s);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.live.user.UserLiveRoomDataCenter$observeLiveRoomChangedSticky$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                c0j7q3.LIZIZ(lifecycleOwner2, lifecycleOwner2.getLifecycle().getCurrentState());
                if (lifecycleOwner2.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    c0j7q3.LJ.remove(c0j7s);
                }
            }
        });
    }
}
