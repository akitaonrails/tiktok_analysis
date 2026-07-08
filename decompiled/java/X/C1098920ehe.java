package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import java.lang.reflect.Field;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ehe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098920ehe extends TuxTextView {
    public static Field LLJJL;
    public static Field LLJJLIIIJLLLLLLLZ;
    public static Field LLJL;
    public Object LLJJJJ;
    public byte LLJJJJJIL;
    public InterfaceC1098940ehg LLJJJJLIIL;

    public final void LJJJJJ() {
        Object obj;
        Object c098200Yq;
        if (LLJJLIIIJLLLLLLLZ == null && (obj = this.LLJJJJ) != null) {
            try {
                Field declaredField = obj.getClass().getDeclaredField("mStatus");
                LLJJLIIIJLLLLLLLZ = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1CC2.LIZ("MarqueeTextView get mStatus field failed", thM5exceptionOrNullimpl);
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        Object c098200Yq;
        Object c098200Yq2;
        super.invalidate();
        if (getEllipsize() == TextUtils.TruncateAt.MARQUEE && this.LLJJJJLIIL != null) {
            if (this.LLJJJJ == null) {
                if (LLJJL == null) {
                    try {
                        Field declaredField = TextView.class.getDeclaredField("mMarquee");
                        LLJJL = declaredField;
                        if (declaredField != null) {
                            declaredField.setAccessible(true);
                        }
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        C1CC2.LIZ("MarqueeTextView get mMarquee field failed", thM5exceptionOrNullimpl);
                    }
                }
                try {
                    Field field = LLJJL;
                    this.LLJJJJ = field != null ? field.get(this) : null;
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                if (thM5exceptionOrNullimpl2 != null) {
                    C1CC2.LIZ("MarqueeTextView get mMarquee object failed", thM5exceptionOrNullimpl2);
                }
            }
            Object obj = this.LLJJJJ;
            if (obj != null) {
                try {
                    LJJJJJ();
                    Field field2 = LLJJLIIIJLLLLLLLZ;
                    if (field2 != null) {
                        byte b = field2.getByte(obj);
                        if (b != this.LLJJJJJIL) {
                            EnumC1098930ehf enumC1098930ehf = b == 0 ? EnumC1098930ehf.STOPPED : b == 1 ? EnumC1098930ehf.STARTING : b == 2 ? EnumC1098930ehf.RUNNING : EnumC1098930ehf.STOPPED;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("marquee status changed to ");
                            sbLIZ.append(enumC1098930ehf);
                            sbLIZ.append(",origin status ");
                            sbLIZ.append((int) b);
                            C20441214yg.LIZIZ("MarqueeTextView", C2188811AlT.LIZIZ(sbLIZ));
                            this.LLJJJJJIL = b;
                            InterfaceC1098940ehg interfaceC1098940ehg = this.LLJJJJLIIL;
                            if (interfaceC1098940ehg != null) {
                                interfaceC1098940ehg.LIZ(enumC1098930ehf);
                            }
                        }
                        this.LLJJJJJIL = b;
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }
        }
    }

    public final void setMarqueeStatusChangeListener(InterfaceC1098940ehg interfaceC1098940ehg) {
        this.LLJJJJLIIL = interfaceC1098940ehg;
    }

    public C1098920ehe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
