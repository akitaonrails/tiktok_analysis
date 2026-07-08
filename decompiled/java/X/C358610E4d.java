package X;

import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$4$downloadTemplateTask$1", f = "CutOptimizedVideoChosenHandler.kt", l = {832, 847, 892, 928, 963, 994}, m = "invokeSuspend")
public final class C358610E4d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends Boolean, ? extends NLETemplateModel, ? extends Long>>, Object> {
    public C443120HZe LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C259800zU LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C0L7R LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ Intent LLJIJIL;
    public final /* synthetic */ Intent LLJILJIL;
    public final /* synthetic */ ArrayList<VideoSegment> LLJILJILJ;
    public final /* synthetic */ C013C LLJILLL;
    public final /* synthetic */ C013C LLJJ;
    public final /* synthetic */ CreativeInfo LLJJI;
    public final /* synthetic */ C013C LLJJIII;
    public final /* synthetic */ C259800zU<C358620E4e> LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;
    public final /* synthetic */ C259800zU<String> LLJJIJIL;
    public final /* synthetic */ C013C LLJJJ;
    public final /* synthetic */ CreativeModel LLJJJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358610E4d(C0L7R c0l7r, String str, boolean z, boolean z2, Intent intent, Intent intent2, ArrayList<VideoSegment> arrayList, C013C c013c, C013C c013c2, CreativeInfo creativeInfo, C013C c013c3, C259800zU<C358620E4e> c259800zU, String str2, C259800zU<String> c259800zU2, C013C c013c4, CreativeModel creativeModel, InterfaceC1364105Vn<? super C358610E4d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c0l7r;
        this.LLIZLLLIL = str;
        this.LLJ = z;
        this.LLJI = z2;
        this.LLJIJIL = intent;
        this.LLJILJIL = intent2;
        this.LLJILJILJ = arrayList;
        this.LLJILLL = c013c;
        this.LLJJ = c013c2;
        this.LLJJI = creativeInfo;
        this.LLJJIII = c013c3;
        this.LLJJIJI = c259800zU;
        this.LLJJIJIIJIL = str2;
        this.LLJJIJIL = c259800zU2;
        this.LLJJJ = c013c4;
        this.LLJJJIL = creativeModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C358610E4d(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103 A[LOOP:0: B:42:0x00fd->B:44:0x0103, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358610E4d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends Boolean, ? extends NLETemplateModel, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
