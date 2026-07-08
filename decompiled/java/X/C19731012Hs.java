package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12Hs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19731012Hs {
    public static final Set<String> LJIIIIZZ = C13LQ.LJLIIL(new String[]{"-1000", "-1001", "-1002"});
    public final Context LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Function0<String> LJ;
    public final Function0<String> LJFF;
    public final boolean LJI;
    public final C19730912Hr LJII = new InterfaceC19730812Hq() { // from class: X.12Hr
        @Override // X.InterfaceC19730812Hq
        public final BeautyCategoryExtra LIZ() {
            return new BeautyCategoryExtra(String.valueOf(this.LIZ.LIZIZ), true, true, false, EnumC19731112Ht.ALL.getFlag(), false, false, false, null, null, null, null, null, false, 16256, null);
        }

        @Override // X.InterfaceC19730812Hq
        public final EffectCategoryResponse LIZIZ() {
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
            effectCategoryResponse.setId("-10000");
            effectCategoryResponse.setName(this.LIZ.LIZ.getResources().getString(2131827320));
            return effectCategoryResponse;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
        @Override // X.InterfaceC19730812Hq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<X.C19730712Hp> LIZJ() {
            /*
                Method dump skipped, instruction units count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C19730912Hr.LIZJ():java.util.List");
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12Hr] */
    public C19731012Hs(Context context, int i, String str, String str2, Function0<String> function0, Function0<String> function02, boolean z) {
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = function0;
        this.LJFF = function02;
        this.LJI = z;
    }
}
