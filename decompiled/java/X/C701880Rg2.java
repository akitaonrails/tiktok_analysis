package X;

import com.ss.android.ugc.feed.platform.componentmanager.data.FCPConfigState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0Rg2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701880Rg2 {
    public InterfaceC703670Riv<FCPConfigState> LIZ;
    public InterfaceC1449905lx<FCPConfigState> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(1));

    public final FCPConfigState LIZIZ() {
        if (C299840Bp8.LIZ()) {
            InterfaceC1449905lx<FCPConfigState> interfaceC1449905lx = this.LIZIZ;
            if (interfaceC1449905lx != null) {
                return interfaceC1449905lx.getState();
            }
            return null;
        }
        InterfaceC703670Riv<FCPConfigState> interfaceC703670Riv = this.LIZ;
        if (interfaceC703670Riv != null) {
            return interfaceC703670Riv.getState();
        }
        return null;
    }

    public final void LIZ(final Object obj, final String str) {
        Function1<InterfaceC700750ReD, InterfaceC700750ReD> function1LIZ;
        Function1<InterfaceC1445905lJ, InterfaceC1445905lJ> function1LIZ2;
        if (C299840Bp8.LIZ()) {
            InterfaceC1449905lx<FCPConfigState> interfaceC1449905lx = this.LIZIZ;
            if (interfaceC1449905lx != null && (function1LIZ2 = interfaceC1449905lx.LIZ()) != null) {
                function1LIZ2.invoke(new InterfaceC1452605mO(str, obj) { // from class: X.0Rh3
                    public final String LIZ;
                    public final Object LIZIZ;

                    @Override // X.InterfaceC1452705mP
                    public final Object getData() {
                        return this.LIZIZ;
                    }

                    @Override // X.InterfaceC1452505mN
                    public final /* bridge */ /* synthetic */ String getType() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = str;
                        this.LIZIZ = obj;
                    }
                });
                return;
            }
            return;
        }
        InterfaceC703670Riv<FCPConfigState> interfaceC703670Riv = this.LIZ;
        if (interfaceC703670Riv == null || (function1LIZ = interfaceC703670Riv.LIZ()) == null) {
            return;
        }
        function1LIZ.invoke(new InterfaceC700750ReD(str, obj) { // from class: X.0Rh7
            public final String LIZ;
            public final Object LIZIZ;

            @Override // X.InterfaceC700750ReD
            public final Object getData() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC702480Rh0
            public final /* bridge */ /* synthetic */ String getType() {
                return this.LIZ;
            }

            {
                this.LIZ = str;
                this.LIZIZ = obj;
            }
        });
    }
}
