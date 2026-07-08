package X;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.101e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191784101e implements Serializable {
    public final Integer backgroundResId;
    public final String buttonId;
    public final boolean enableDebouncing;
    public final Integer icon;
    public final Function1<String, Unit> onClick;
    public final Float radius;
    public final EnumC191783101d style;
    public final String title;

    public C191784101e() {
        this("", "", EnumC191783101d.PRIMARY, null, null, null, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C191784101e(String str, String str2, EnumC191783101d enumC191783101d, Function1<? super String, Unit> function1, Integer num, Float f, Integer num2, boolean z) {
        this.title = str;
        this.buttonId = str2;
        this.style = enumC191783101d;
        this.onClick = function1;
        this.backgroundResId = num;
        this.radius = f;
        this.icon = num2;
        this.enableDebouncing = z;
    }
}
