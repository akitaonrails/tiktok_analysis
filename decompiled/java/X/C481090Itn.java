package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0Itn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481090Itn extends C16FB {
    public C481090Itn(Context context) {
        this(context, null, 6);
    }

    public C481090Itn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public C481090Itn(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setScrollMode(EnumC481060Itk.REFRESH);
        setNestedHeader(new C446160HeY(context));
    }
}
