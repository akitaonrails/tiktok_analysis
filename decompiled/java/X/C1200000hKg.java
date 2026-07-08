package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;

/* JADX INFO: renamed from: X.0hKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200000hKg {
    public static final C1200010hKh LIZ = new InterfaceC1199990hKf() { // from class: X.0hKh
        @Override // X.InterfaceC1199990hKf
        public final InterfaceC1199990hKf LJIJ(boolean z) {
            return this;
        }

        @Override // X.InterfaceC1199990hKf
        public final InterfaceC1199990hKf LJIJI(String str) {
            return this;
        }

        @Override // X.InterfaceC1199990hKf
        public final InterfaceC1199990hKf LJIJJ(Map<String, String> map) {
            return this;
        }

        @Override // X.InterfaceC1199990hKf
        public final InterfaceC1199990hKf LJIJJLI() {
            return this;
        }

        @Override // X.InterfaceC1199990hKf
        public final InterfaceC1199990hKf LJIL(LifecycleOwner lifecycleOwner) {
            return this;
        }

        @Override // X.InterfaceC1199990hKf
        public final InterfaceC1199990hKf LJJ(View view) {
            return this;
        }

        @Override // X.InterfaceC1199990hKf
        public final InterfaceC1199990hKf LJJI(Throwable th) {
            return this;
        }

        @Override // X.InterfaceC1199990hKf
        public final InterfaceC1199990hKf LJJIFFI() {
            return this;
        }

        @Override // X.InterfaceC1199990hKf
        public final InterfaceC1199990hKf start() {
            return this;
        }
    };

    public static final InterfaceC1199990hKf LIZIZ(String str) {
        C1200030hKj c1200030hKj;
        C1200010hKh c1200010hKh = LIZ;
        if (str != null && (c1200030hKj = C2177408g0.LIZIZ.get(str)) != null) {
            return c1200030hKj.LIZ("start_to_end", true);
        }
        return c1200010hKh;
    }

    public static final InterfaceC1199990hKf LIZ(String str, String str2) {
        C1200030hKj c1200030hKj;
        C1200010hKh c1200010hKh = LIZ;
        if (str != null && (c1200030hKj = C2177408g0.LIZIZ.get(str)) != null) {
            return c1200030hKj.LIZ(str2, false);
        }
        return c1200010hKh;
    }
}
