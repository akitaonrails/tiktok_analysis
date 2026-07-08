package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ROW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public interface C0ROW {
    void LIZ(Fragment fragment, C19EG c19eg);

    void LIZIZ();

    View LIZJ(String str, Context context, Fragment fragment, int i, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, boolean z2);

    View LIZLLL(Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z);

    void LJ(Context context, Fragment fragment, String str);

    void LJFF(Context context, EnumC706640Rni enumC706640Rni, Fragment fragment, String str);

    <RECEIVER extends C03H5> void LJI(ReusedUISlotAssem<RECEIVER> reusedUISlotAssem, String str, boolean z, Function0<Unit> function0);
}
