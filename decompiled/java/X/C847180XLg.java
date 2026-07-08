package X;

import android.content.res.Resources;
import android.os.Build;
import com.ss.android.ugc.aweme.legoImp.task.region.RegionInitTask;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847180XLg extends C09AY implements Function0<Locale> {
    public C847180XLg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Locale invoke() {
        RegionInitTask.LL.getClass();
        return Build.VERSION.SDK_INT >= 24 ? Resources.getSystem().getConfiguration().getLocales().get(0) : Resources.getSystem().getConfiguration().locale;
    }
}
