package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.15Sb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20522315Sb extends C16FB {
    public final C446180Hea LLLFZ;

    public C20522315Sb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setBallOffset(float f) {
        this.LLLFZ.setBallTranslationY(f);
    }

    public final void setBallPullThreshold(int i) {
        this.LLLFZ.setPullThreshold(i);
    }

    public C20522315Sb(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C446180Hea c446180Hea = new C446180Hea(context);
        this.LLLFZ = c446180Hea;
        setClipChildren(false);
        setScrollMode(EnumC481060Itk.REFRESH);
        setNestedHeader(c446180Hea);
    }
}
