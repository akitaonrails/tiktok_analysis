package X;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.038e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7938038e extends LinearLayout {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;

    public final SmartImageView getIvIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lkw);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getTvContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zf0);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setBackgroundColor(String str) {
        Object objValueOf;
        C384050F3z c384050F3z = new C384050F3z();
        Object obj = null;
        if (str == null) {
            objValueOf = null;
        } else {
            try {
                objValueOf = Integer.valueOf(Color.parseColor(str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objValueOf = new C098200Yq(th);
                C189200o6.m2constructorimpl(objValueOf);
            }
        }
        C189200o6.m2constructorimpl(objValueOf);
        if (!C189200o6.m7isFailureimpl(objValueOf)) {
            obj = objValueOf;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        } else {
            c384050F3z.LIZ = num;
        }
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        setBackground(c384050F3z.LIZ(getContext()));
    }

    public final void setContentColor(String str) {
        Object c098200Yq;
        if (str != null) {
            try {
                TuxTextView tvContentFromXml = getTvContentFromXml();
                if (tvContentFromXml != null) {
                    tvContentFromXml.setTextColor(Color.parseColor(str));
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public final void setIvIconFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setTvContentFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public C7938038e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.axj, this, true);
        setOrientation(0);
        setGravity(16);
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
    }
}
