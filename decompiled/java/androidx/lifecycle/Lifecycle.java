package androidx.lifecycle;

import X.C05YD;
import X.C08FF;
import X.C09IC;
import X.C1954807lC;
import X.C1BNE;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import X.InterfaceC332260D0u;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Lifecycle {
    public AtomicReference<Object> internalScopeRef = new AtomicReference<>(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes8.dex */
    public static final class Event {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Event[] $VALUES;
        public static final Companion Companion;
        public static final Event ON_CREATE = new Event("ON_CREATE", 0);
        public static final Event ON_START = new Event("ON_START", 1);
        public static final Event ON_RESUME = new Event("ON_RESUME", 2);
        public static final Event ON_PAUSE = new Event("ON_PAUSE", 3);
        public static final Event ON_STOP = new Event("ON_STOP", 4);
        public static final Event ON_DESTROY = new Event("ON_DESTROY", 5);
        public static final Event ON_ANY = new Event("ON_ANY", 6);

        /* JADX INFO: loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError e7) {
                    TryCatchGuardChecker.doCheck(e7);
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static final /* synthetic */ Event[] $values() {
            return new Event[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        public static final Event downFrom(State state) {
            return Companion.downFrom(state);
        }

        public static final Event downTo(State state) {
            return Companion.downTo(state);
        }

        public static InterfaceC2044707zh<Event> getEntries() {
            return $ENTRIES;
        }

        public static final Event upFrom(State state) {
            return Companion.upFrom(state);
        }

        public static final Event upTo(State state) {
            return Companion.upTo(state);
        }

        static {
            Event[] eventArr$values = $values();
            $VALUES = eventArr$values;
            $ENTRIES = new C2254308sP(eventArr$values);
            Companion = new Companion();
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        public final State getTargetState() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                case 7:
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this);
                    sbLIZ.append(" has no target state");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                default:
                    throw new C1954807lC();
            }
        }

        public static final class Companion {

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError e5) {
                        TryCatchGuardChecker.doCheck(e5);
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public final Event upFrom(State state) {
                return androidx_lifecycle_Lifecycle$Event$Companion_com_ss_android_ugc_aweme_lancet_ActivityLancet_upEvent(this, state);
            }

            public final Event androidx_lifecycle_Lifecycle$Event$Companion__upFrom$___twin___(State state) {
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 5) {
                            return null;
                        }
                        return Event.ON_CREATE;
                    }
                    return Event.ON_RESUME;
                }
                return Event.ON_START;
            }

            public final Event downFrom(State state) {
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return Event.ON_PAUSE;
                    }
                    return Event.ON_STOP;
                }
                return Event.ON_DESTROY;
            }

            public final Event downTo(State state) {
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            return null;
                        }
                        return Event.ON_DESTROY;
                    }
                    return Event.ON_PAUSE;
                }
                return Event.ON_STOP;
            }

            public final Event upTo(State state) {
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return Event.ON_RESUME;
                    }
                    return Event.ON_START;
                }
                return Event.ON_CREATE;
            }

            public static Event androidx_lifecycle_Lifecycle$Event$Companion_com_ss_android_ugc_aweme_lancet_ActivityLancet_upEvent(Companion companion, State state) {
                if (state == State.DESTROYED) {
                    return Event.ON_CREATE;
                }
                return companion.androidx_lifecycle_Lifecycle$Event$Companion__upFrom$___twin___(state);
            }
        }

        public static Event valueOf(String str) {
            return (Event) C08FF.LIZ(Event.class, str);
        }

        public Event(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes30.dex */
    public static final class State {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ State[] $VALUES;
        public static final State DESTROYED = new State("DESTROYED", 0);
        public static final State INITIALIZED = new State("INITIALIZED", 1);
        public static final State CREATED = new State("CREATED", 2);
        public static final State STARTED = new State("STARTED", 3);
        public static final State RESUMED = new State("RESUMED", 4);

        public static final /* synthetic */ State[] $values() {
            return new State[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
        }

        public static InterfaceC2044707zh<State> getEntries() {
            return $ENTRIES;
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = new C2254308sP(stateArr$values);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public static State valueOf(String str) {
            return (State) C08FF.LIZ(State.class, str);
        }

        public final boolean isAtLeast(State state) {
            if (compareTo(state) >= 0) {
                return true;
            }
            return false;
        }

        public State(String str, int i) {
        }
    }

    public abstract void addObserver(LifecycleObserver lifecycleObserver);

    public abstract State getCurrentState();

    public abstract void removeObserver(LifecycleObserver lifecycleObserver);

    public C05YD<State> getCurrentStateFlow() {
        final C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(getCurrentState());
        addObserver(new LifecycleEventObserver() { // from class: X.0nMO
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle._get_currentStateFlow_$lambda$0(c2252321DDqLIZ, lifecycleOwner, event);
            }
        });
        return C09IC.LIZIZ(c2252321DDqLIZ);
    }

    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public final void setInternalScopeRef(AtomicReference<Object> atomicReference) {
        this.internalScopeRef = atomicReference;
    }

    public static final void _get_currentStateFlow_$lambda$0(InterfaceC332260D0u interfaceC332260D0u, LifecycleOwner lifecycleOwner, Event event) {
        interfaceC332260D0u.setValue(event.getTargetState());
    }
}
