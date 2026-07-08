package com.bytedance.android.btm.api;

import X.C08FF;
import X.C0PSL;
import X.C669610QOh;
import X.InterfaceC1294060jmO;

/* JADX INFO: loaded from: classes22.dex */
public interface BtmPageLifecycle {
    @InterfaceC1294060jmO
    void LIZ(Object obj, boolean z);

    void LIZIZ(Object obj, State state);

    void LIZJ(Object obj);

    void LIZLLL(Object obj, Boolean bool, C0PSL c0psl);

    boolean LJ(Object obj, boolean z, C0PSL c0psl);

    void LJFF(Object obj, Boolean bool, C669610QOh c669610QOh);

    State LJI(Object obj);

    /* JADX INFO: loaded from: classes33.dex */
    public enum State {
        INITIALIZED,
        CREATED,
        RESUMED,
        PAUSED,
        DESTROYED;

        public static State valueOf(String str) {
            return (State) C08FF.LIZ(State.class, str);
        }

        public boolean isAtLeast(State state) {
            if (compareTo(state) >= 0) {
                return true;
            }
            return false;
        }
    }
}
