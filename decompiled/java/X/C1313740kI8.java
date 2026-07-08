package X;

import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kI8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313740kI8 implements Drawable.Callback {
    public final List<AbstractC1314220kIu> LL = new ArrayList();
    public final List<C1314400kJC> LLILLJJLI = new ArrayList();
    public final List<Integer> LLILLL = new ArrayList();
    public final List<Integer> LLILZ = new ArrayList();
    public final List<EnumC1314070kIf> LLILZIL = new ArrayList();
    public final List<C1314520kJO> LLILZLL = new ArrayList();
    public final BackgroundDrawable LLIZ;
    public boolean LLIZLLLIL;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final int LIZ() {
        if (((ArrayList) this.LLILZ).isEmpty()) {
            return 1;
        }
        List<Integer> list = this.LLILZ;
        return ((Integer) ListProtector.get(list, ((ArrayList) list).size() - 1)).intValue();
    }

    public C1313740kI8(BackgroundDrawable backgroundDrawable) {
        this.LLIZ = backgroundDrawable;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.LLIZ.invalidateSelf();
    }
}
