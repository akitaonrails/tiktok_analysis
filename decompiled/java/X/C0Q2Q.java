package X;

import X.C0Q2Q;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0Q2Q<T extends C0Q2Q<T>> extends AbstractC1386130mAt<T> {
    public final HashMap<String, String> LJIILLIIL;

    @Override // X.AbstractC1386130mAt
    public void LJIIIIZZ() {
    }

    public void LJIILLIIL() {
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIILIIL() {
        super.LJIILIIL();
        ((HashMap) this.LIZIZ).putAll(this.LJIILLIIL);
    }

    public C0Q2Q(String str) {
        super(str);
        this.LJIILLIIL = new HashMap<>();
    }

    public final void LJIJ(Map map) {
        this.LJIILLIIL.putAll(map);
    }

    public final void LJIJJ(String str) {
        this.LIZLLL = str;
        LJIILLIIL();
        LJIIZILJ("enter_from", str);
    }

    public final void LJIJJLI(String str) {
        LJIIZILJ("enter_method", str);
    }

    public final void LJIL(String str) {
        LJIIZILJ("group_id", str);
    }

    public final void LJJ(Boolean bool) {
        String str;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIZILJ("is_from_outside", str);
    }

    public final void LJJI(String str) {
        LJIIZILJ("last_from_group_id", str);
    }

    public final void LJIIZILJ(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            HashMap<String, String> map = this.LJIILLIIL;
            if (str2 == null) {
                str2 = "";
            }
            map.put(str, str2);
        }
    }

    public final void LJIJI(String str, String str2) {
        HashMap<String, String> map = this.LJIILLIIL;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }
}
