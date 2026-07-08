package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import defpackage.l9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J7Q, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J7Q {
    public static final C01GW<C0J7Q> LJIIIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(160));
    public final ConcurrentHashMap<String, MutableLiveData<C0J7T>> LIZ = new ConcurrentHashMap<>();
    public final l9 LIZIZ;
    public final C05CO LIZJ;
    public final long LIZLLL;
    public final List<C0J7S> LJ;
    public AnonymousClass0956 LJFF;
    public Long LJI;
    public final C01GW LJII;
    public final ConcurrentHashMap<String, Boolean> LJIIIIZZ;

    public C0J7Q() {
        l9 l9Var = new l9();
        this.LIZIZ = l9Var;
        C05CO c05co = new C05CO();
        this.LIZJ = c05co;
        this.LIZLLL = ((long) (((Number) C293020Be8.LIZ.getValue()).intValue() * 60)) * 1000;
        this.LJ = Collections.synchronizedList(new ArrayList());
        this.LJII = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(161));
        this.LJIIIIZZ = new ConcurrentHashMap<>();
        l9Var.LIZLLL = new AwS586S0100000_7(this, 250);
        if (((Boolean) C292950Be1.LIZ.getValue()).booleanValue()) {
            InterfaceC481880Iv4 interfaceC481880Iv4 = new InterfaceC481880Iv4() { // from class: X.0J7O
                @Override // X.InterfaceC481880Iv4
                public final C481790Iuv q(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) {
                    Boolean bool;
                    long j;
                    C486450J5v c486450J5vLIZIZ;
                    long j2 = feedUserRoomMonitorMessage.roomStatus;
                    if (j2 == 4) {
                        bool = Boolean.FALSE;
                    } else {
                        if (j2 == 2) {
                            bool = Boolean.TRUE;
                        }
                        return new C481790Iuv(true, true, "inbox_dm_head");
                    }
                    if (bool != null) {
                        C0J7Q c0j7q = this.LL;
                        boolean zBooleanValue = bool.booleanValue();
                        long j3 = feedUserRoomMonitorMessage.anchorId;
                        long j4 = feedUserRoomMonitorMessage.roomId;
                        if (zBooleanValue) {
                            InterfaceC1602300rnY interfaceC1602300rnY = (InterfaceC1602300rnY) c0j7q.LJII.getValue();
                            if (interfaceC1602300rnY != null && (c486450J5vLIZIZ = interfaceC1602300rnY.LIZIZ()) != null) {
                                j = c486450J5vLIZIZ.LIZJ;
                            } else {
                                j = 1;
                            }
                            InterfaceC1602300rnY interfaceC1602300rnY2 = (InterfaceC1602300rnY) c0j7q.LJII.getValue();
                            if (interfaceC1602300rnY2 != null) {
                                interfaceC1602300rnY2.LJIIIZ(j3, j4, j * 1000, new C0J7N(j3, c0j7q, j4));
                            }
                        } else {
                            c0j7q.getClass();
                            c0j7q.LIZ(String.valueOf(j3), null, System.currentTimeMillis(), null);
                        }
                    }
                    return new C481790Iuv(true, true, "inbox_dm_head");
                }
            };
            InterfaceC1602300rnY interfaceC1602300rnY = (InterfaceC1602300rnY) c05co.LIZJ.getValue();
            if (interfaceC1602300rnY != null) {
                interfaceC1602300rnY.LJIIIIZZ();
            }
            InterfaceC1602300rnY interfaceC1602300rnY2 = (InterfaceC1602300rnY) c05co.LIZJ.getValue();
            if (interfaceC1602300rnY2 != null) {
                interfaceC1602300rnY2.LIZLLL(interfaceC481880Iv4, "inbox_dm_head");
            }
        }
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        int i;
        if (((Boolean) C292950Be1.LIZ.getValue()).booleanValue()) {
            return;
        }
        String strValueOf = String.valueOf(lifecycleOwner.hashCode());
        boolean zIsAtLeast = state.isAtLeast(Lifecycle.State.RESUMED);
        if (!Intrinsics.LJFF(this.LJIIIIZZ.get(strValueOf), Boolean.valueOf(zIsAtLeast))) {
            this.LJIIIIZZ.put(strValueOf, Boolean.valueOf(zIsAtLeast));
            ConcurrentHashMap<String, Boolean> concurrentHashMap = this.LJIIIIZZ;
            if (concurrentHashMap.isEmpty()) {
                i = 0;
            } else {
                Iterator<Map.Entry<String, Boolean>> it2 = concurrentHashMap.entrySet().iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (it2.next().getValue().booleanValue()) {
                        i++;
                    }
                }
            }
            C0J7M.LIZIZ("UserLiveRoomDataCenter", "active lifecycle count: " + i);
            if (i == 0) {
                AnonymousClass0956 anonymousClass0956 = this.LJFF;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LJI = Long.valueOf(System.currentTimeMillis());
            } else {
                AnonymousClass0956 anonymousClass09562 = this.LJFF;
                if (anonymousClass09562 == null || !anonymousClass09562.isActive()) {
                    C0J7M.LIZIZ("UserLiveRoomDataCenter", "startPolling");
                    this.LJFF = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0J7P(this, null), 3);
                }
            }
        }
        if (state == Lifecycle.State.DESTROYED) {
            this.LJIIIIZZ.remove(strValueOf);
        }
    }

    public final void LIZ(String str, Long l, long j, SlimRoom slimRoom) {
        MutableLiveData<C0J7T> mutableLiveData = this.LIZ.get(str);
        if (mutableLiveData != null) {
            C0J7T value = mutableLiveData.getValue();
            if (value == null || !Intrinsics.LJFF(value.LIZ, l)) {
                mutableLiveData.setValue(new C0J7T(l, j, slimRoom));
                return;
            }
            return;
        }
        this.LIZ.put(str, new MutableLiveData<>(new C0J7T(l, j, slimRoom)));
    }
}
