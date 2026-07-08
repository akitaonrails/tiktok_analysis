package X;

import android.content.Context;
import java.util.Locale;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS461S0200000_26;

/* JADX INFO: renamed from: X.0uv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1722330uv9 extends InterfaceC1547650qNP {
    Locale LJFF(Context context);

    void LJII(String str, String str2, String str3, String str4, String str5, AwS109S1200000_26 awS109S1200000_26, AwS461S0200000_26 awS461S0200000_26);

    String getCurrentRegionCode();

    String getPriorityRegion();

    String getRegion();

    String getSimCountry();

    String getStoreRegionUpperCase();

    String getSysRegion();
}
