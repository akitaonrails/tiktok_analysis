package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS25S1100000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0kFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312390kFx extends AbstractC1313520kHm<C417540GYu> {
    public String LLLLLLLZIL;
    public String LLLLLLZ;
    public final C790980V1c LLLLLLZZ;
    public final C1DX7 LLLLLZ;
    public C2257191DWj LLLLLZIL;

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJIIJ() {
        super.LJIIJ();
        LIZ();
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJJI() {
        super.LJJLIIIJJI();
        LIZ();
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJJIZ() {
        super.LJJLIIIJJIZ();
        this.LLLLLZ.LIZ(this.LLJJJIL, this.LLJJJJ);
        if (this.LLLLLZIL != null) {
            C1290750jh3.LIZLLL(new ARunnableS120S0100000_20(this, 326));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0V1c] */
    public C1312390kFx(AbstractC1317090kNX abstractC1317090kNX) {
        super(abstractC1317090kNX);
        this.LLLLLZ = new C1DX7(abstractC1317090kNX.LLILZIL.LLL, this.LLL);
        this.LLLLLLZZ = new C1290350jgP(this) { // from class: X.0V1c
            public final HashMap<String, Bitmap> LIZLLL;

            @Override // X.C1290350jgP
            public final void LIZ() {
                Iterator<Map.Entry<String, Bitmap>> it2 = this.LIZLLL.entrySet().iterator();
                while (it2.hasNext()) {
                    try {
                        C786410Ut5.LJJJJ(it2.next().getValue());
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                this.LIZLLL.clear();
            }

            {
                super(null);
                this.LIZLLL = new HashMap<>();
                new WeakReference(this);
            }
        };
    }

    @Override // X.AbstractC1313520kHm
    public final View LJLJJL(Context context) {
        return new C417540GYu((AbstractC1317090kNX) context);
    }

    @InterfaceC1291270jht(name = "content")
    public void setContent(String str) {
        if (TextUtils.isEmpty(str)) {
            ((C417540GYu) this.LLLLLILLIL).setImageDrawable(null);
        } else {
            if (str.equals(this.LLLLLLZ)) {
                return;
            }
            this.LLLLLLZ = str;
            C1314100kIi.LIZ().execute(new ARunnableS25S1100000_20(this, str, 26));
        }
    }

    @InterfaceC1291270jht(name = "src")
    public void setSource(String str) {
        if (TextUtils.isEmpty(str)) {
            this.LLLLLLLZIL = null;
            ((C417540GYu) this.LLLLLILLIL).setImageDrawable(null);
        } else {
            if (str.equals(this.LLLLLLLZIL)) {
                return;
            }
            this.LLLLLLLZIL = str;
            if (str.startsWith("data:image/svg+xml;base64")) {
                setContent(new String(Base64.decode(this.LLLLLLLZIL.substring(26).getBytes(), 0)));
            } else {
                getClass();
            }
        }
    }
}
