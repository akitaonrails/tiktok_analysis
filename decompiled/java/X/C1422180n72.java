package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS108S0110000_22;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS47S0301000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n72, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422180n72 {
    public final InterfaceC1422570n7f LIZ;
    public final InterfaceC1422770n7z LIZIZ;
    public final InterfaceC1422310n7F LIZJ;
    public final Function0<ShortVideoContext> LIZLLL;
    public final Map<TemplateCategoryData, Long> LJ;

    public C1422180n72() {
        this(null, null, null, AFwS210S0000000_22.get$arr$(454));
    }

    public final void LIZLLL() {
        TemplateCategoryData templateCategoryDataY8;
        InterfaceC1422570n7f interfaceC1422570n7f = this.LIZ;
        if (interfaceC1422570n7f == null || (templateCategoryDataY8 = interfaceC1422570n7f.Y8()) == null) {
            return;
        }
        LJFF(new AwS601S0100000_22(templateCategoryDataY8, 829));
        this.LIZ.s92(templateCategoryDataY8, true, false, false, 0, C1337770kut.LIZ());
    }

    public final void LIZ(boolean z) {
        TemplateCategoryData templateCategoryDataY8;
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "TemplateListViewActionImpl", "loadMoreTemplates");
        InterfaceC1422570n7f interfaceC1422570n7f = this.LIZ;
        if (interfaceC1422570n7f != null && (templateCategoryDataY8 = interfaceC1422570n7f.Y8()) != null) {
            LJFF(new AwS108S0110000_22(templateCategoryDataY8, z, 15));
            this.LIZ.s92(templateCategoryDataY8, false, true, z, 0, C1337770kut.LIZ());
        }
    }

    public final void LJFF(Function1<? super ShortVideoContext, Unit> function1) {
        ShortVideoContext shortVideoContextInvoke = this.LIZLLL.invoke();
        if (shortVideoContextInvoke != null) {
            function1.invoke(shortVideoContextInvoke);
        }
    }

    public final void LIZIZ(Map<TemplateCategoryData, Long> map, TemplateCategoryData templateCategoryData) {
        if (map.get(templateCategoryData) == null) {
            return;
        }
        this.LJ.put(templateCategoryData, Long.valueOf(System.currentTimeMillis()));
        LJFF(new AwS231S0300000_22(this, (C1422180n72) map, (Map<TemplateCategoryData, Long>) templateCategoryData, (TemplateCategoryData) 37));
    }

    public final void LIZJ(C1422430n7R c1422430n7R, boolean z) {
        InterfaceC1422310n7F interfaceC1422310n7F;
        InterfaceC1422570n7f interfaceC1422570n7f;
        if ((z || (interfaceC1422570n7f = this.LIZ) == null || interfaceC1422570n7f.Y8() == null || Intrinsics.LJFF(c1422430n7R.LIZ, this.LIZ.Y8())) && (interfaceC1422310n7F = this.LIZJ) != null) {
            interfaceC1422310n7F.cr2(0, c1422430n7R);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1422180n72(InterfaceC1422570n7f interfaceC1422570n7f, InterfaceC1422770n7z interfaceC1422770n7z, InterfaceC1422310n7F interfaceC1422310n7F, Function0<? extends ShortVideoContext> function0) {
        this.LIZ = interfaceC1422570n7f;
        this.LIZIZ = interfaceC1422770n7z;
        this.LIZJ = interfaceC1422310n7F;
        this.LIZLLL = function0;
        this.LJ = new LinkedHashMap();
    }

    public final void LJ(C1419590n2r c1419590n2r, View view, int i, float f, Bitmap bitmap) {
        TemplateCategoryData templateCategoryDataY8;
        InterfaceC1422570n7f interfaceC1422570n7f = this.LIZ;
        if (interfaceC1422570n7f != null && (templateCategoryDataY8 = interfaceC1422570n7f.Y8()) != null) {
            LJFF(new AwS47S0301000_22(i, c1419590n2r, templateCategoryDataY8, this, 5));
        }
        InterfaceC1422770n7z interfaceC1422770n7z = this.LIZIZ;
        if (interfaceC1422770n7z != null) {
            interfaceC1422770n7z.RQ1(C420010GdT.LIZ(view), c1419590n2r, i, f, bitmap);
        }
    }
}
