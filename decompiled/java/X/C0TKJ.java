package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AwS161S1100000_12;

/* JADX INFO: renamed from: X.0TKJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TKJ implements InterfaceC20109713mJ {
    public static final /* synthetic */ InterfaceC2217461Bqa[] LIZJ;
    public final C01GW LIZ;
    public final Context LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C13LE.LIZ(C0TKJ.class), "cacheShared", "getCacheShared()Landroid/content/SharedPreferences;");
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final SharedPreferences LIZJ() {
        C01GW c01gw = this.LIZ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = LIZJ;
        return (SharedPreferences) c01gw.getValue();
    }

    @Override // X.InterfaceC20109713mJ
    public final Collection LIZIZ() {
        return LIZJ().getStringSet("__prefetch_cache_key_array", null);
    }

    @Override // X.InterfaceC20109713mJ
    public final void removeAll() {
        LIZJ().edit().clear().apply();
    }

    @Override // X.InterfaceC20109713mJ
    public final void LIZ(Collection collection) {
        if (collection instanceof Set) {
            LIZJ().edit().putStringSet("__prefetch_cache_key_array", (Set) collection).apply();
        }
    }

    @Override // X.InterfaceC20109713mJ
    public final String getString(String str) {
        return LIZJ().getString(str, null);
    }

    @Override // X.InterfaceC20109713mJ
    public final void remove(String str) {
        LIZJ().edit().remove(str).apply();
    }

    public C0TKJ(Context context, String str) {
        this.LIZIZ = context;
        this.LIZ = C452501pT.LIZIZ(new AwS161S1100000_12(this, str, 9));
    }

    @Override // X.InterfaceC20109713mJ
    public final void putString(String str, String str2) {
        LIZJ().edit().putString(str, str2).apply();
    }
}
