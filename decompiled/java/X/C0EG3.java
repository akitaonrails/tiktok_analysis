package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EG3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EG3 {
    public final Activity LIZ;
    public final C1DRG LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final C0E48 LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public Function0<Unit> LJI;

    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.194j] */
    public final void LIZ(Bitmap bitmap, C19A3 c19a3) {
        C259800zU c259800zU = new C259800zU();
        CreativeBottomSheetBehavior<?> creativeBottomSheetBehavior = new CreativeBottomSheetBehavior<>();
        creativeBottomSheetBehavior.LJJ = false;
        creativeBottomSheetBehavior.LJIIJ = false;
        C18YA c18ya = new C18YA();
        c18ya.LIZ(new AwS249S0300000_5(this, (C0EG3) bitmap, (Bitmap) c259800zU, (C259800zU<C214799194j>) 6));
        c18ya.LIZ.LLJLILLLLZIIL = creativeBottomSheetBehavior;
        c18ya.LIZIZ(EnumC214804194o.AUTO_SIZE);
        C214799194j c214799194j = c18ya.LIZ;
        c214799194j.LLLIIIIL = 0;
        c214799194j.LLJJLIIIJLLLLLLLZ = false;
        c18ya.LIZ.LLJZ = new AwS549S0100000_5(this, 359);
        AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 360);
        ?? r1 = c18ya.LIZ;
        r1.LLJLLL = awS549S0100000_5;
        c259800zU.element = r1;
        this.LJFF = true;
        r1.LLLLL(c19a3);
    }

    public C0EG3(Activity activity, C1DRG c1drg, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        this.LIZ = activity;
        this.LIZIZ = c1drg;
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = c0e48;
    }
}
