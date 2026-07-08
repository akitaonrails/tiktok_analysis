package X;

import Y.AgS196S0200000_5;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.text.Charsets;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ewv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateTransitionFramePreTask$execute$2", f = "TemplateTransitionFramePreTask.kt", l = {120, 129, 138}, m = "invokeSuspend")
public final class C381110Ewv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public C381180Ex2 LLILLL;
    public CreativeInfo LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ NLEVideoEffect LLJI;
    public final /* synthetic */ List<Pair<NLETrackSlot, NLETrackSlot>> LLJIJIL;
    public final /* synthetic */ C0FQS LLJILJIL;
    public final /* synthetic */ NLETrackSlot LLJILJILJ;
    public final /* synthetic */ C381180Ex2 LLJILLL;
    public final /* synthetic */ CreativeInfo LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ String LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381110Ewv(NLEVideoEffect nLEVideoEffect, List<Pair<NLETrackSlot, NLETrackSlot>> list, C0FQS c0fqs, NLETrackSlot nLETrackSlot, C381180Ex2 c381180Ex2, CreativeInfo creativeInfo, String str, String str2, String str3, InterfaceC1364105Vn<? super C381110Ewv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = nLEVideoEffect;
        this.LLJIJIL = list;
        this.LLJILJIL = c0fqs;
        this.LLJILJILJ = nLETrackSlot;
        this.LLJILLL = c381180Ex2;
        this.LLJJ = creativeInfo;
        this.LLJJI = str;
        this.LLJJIII = str2;
        this.LLJJIJI = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381110Ewv(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String resourceFile;
        C259800zU c259800zU;
        C259800zU c259800zU2;
        C381180Ex2 c381180Ex2;
        CreativeInfo creativeInfo;
        String str;
        String str2;
        String str3;
        Iterator<Pair<NLETrackSlot, NLETrackSlot>> it2;
        NLEResourceNode resource;
        InterfaceC346201Wa<List<C0LSZ>> interfaceC346201WaLJJJJLI;
        NLETemplateModel nLETemplateModel;
        NLETrack mainTrack;
        NLEResourceNode resource2;
        String resourceFile2;
        C1C7U.LIZ("TemplateTransitionFramePreTask@5578.execute$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLJ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TemplateTransitionFramePreTask@5578.execute$2");
                return unit;
            }
            it2 = (Iterator) this.LLIZLLLIL;
            str3 = (String) this.LLIZ;
            str2 = (String) this.LLILZLL;
            str = (String) this.LLILZIL;
            creativeInfo = this.LLILZ;
            c381180Ex2 = this.LLILLL;
            c259800zU2 = this.LLILLJJLI;
            c259800zU = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            NLESegmentEffect segment = this.LLJI.getSegment();
            if (segment != null && (resource = segment.getResource()) != null) {
                resourceFile = resource.getResourceFile();
            } else {
                resourceFile = null;
            }
            C0VSJ c0vsj = new C0VSJ(resourceFile, "extra.json");
            c259800zU = new C259800zU();
            c259800zU2 = new C259800zU();
            JSONObject jSONObject = new JSONObject(C09BH.LJI(c0vsj, Charsets.UTF_8));
            c259800zU.element = JSONObjectProtectorUtils.getString(jSONObject, "req_key");
            c259800zU2.element = JSONObjectProtectorUtils.getString(jSONObject, "req_json");
            List<Pair<NLETrackSlot, NLETrackSlot>> list = this.LLJIJIL;
            c381180Ex2 = this.LLJILLL;
            creativeInfo = this.LLJJ;
            str = this.LLJJI;
            str2 = this.LLJJIII;
            str3 = this.LLJJIJI;
            it2 = list.iterator();
        }
        while (it2.hasNext()) {
            Pair<NLETrackSlot, NLETrackSlot> next = it2.next();
            if (C356770Dyl.LIZ()) {
                String str4 = (String) c259800zU.element;
                String str5 = (String) c259800zU2.element;
                c381180Ex2.getClass();
                InterfaceC378020Erw interfaceC378020ErwLIZ = C381240Ex8.LIZIZ.LIZ(new C379640EuY(EnumC379630EuX.TEMPLATE, c381180Ex2.LJII, new AwS549S0100000_5(creativeInfo, 1562)));
                NLETrackSlot first = next.getFirst();
                InterfaceC381940EyG interfaceC381940EyGLIZ = interfaceC378020ErwLIZ.LIZ();
                EnumC381960EyI enumC381960EyI = EnumC381960EyI.TEMPLATE;
                String typeName = EnumC381980EyK.TRANSITION_FRAME.getTypeName();
                String uuid = first.getUUID();
                List listLIZIZ = C0OFE.LIZIZ(next);
                ArrayList arrayList = new ArrayList();
                Iterator it3 = listLIZIZ.iterator();
                while (it3.hasNext()) {
                    NLESegment mainSegment = ((NLETrackSlot) it3.next()).getMainSegment();
                    if (mainSegment != null && (resource2 = mainSegment.getResource()) != null && (resourceFile2 = resource2.getResourceFile()) != null) {
                        arrayList.add(resourceFile2);
                    }
                }
                interfaceC381940EyGLIZ.LJ(new C381600Exi(null, null, enumC381960EyI, null, null, null, null, 0, null, null, null, false, false, null, null, null, new C382180Eye(creativeInfo, null, null, null, uuid, null, null, str2, str3, str, null, enumC381960EyI, 0, str4, str5, null, arrayList, null, null, typeName, 7287918), null, 1572859), false, new InterfaceC382370Eyx() { // from class: X.0Eww
                    @Override // X.InterfaceC382370Eyx
                    public final void LIZ(C377760ErW c377760ErW, EnumC381960EyI enumC381960EyI2, String str6, String str7) {
                    }

                    @Override // X.InterfaceC382370Eyx
                    public final void LJIIJ(String str6) {
                    }
                });
            } else {
                String str6 = (String) c259800zU.element;
                String str7 = (String) c259800zU2.element;
                this.LL = c259800zU;
                this.LLILLJJLI = c259800zU2;
                this.LLILLL = c381180Ex2;
                this.LLILZ = creativeInfo;
                this.LLILZIL = str;
                this.LLILZLL = str2;
                this.LLIZ = str3;
                this.LLIZLLLIL = it2;
                this.LLJ = 1;
                if (c381180Ex2.LJJIJIIJI(creativeInfo, str, str2, str3, next, str6, str7, this) == objLJFF) {
                    C1C7U.LIZIZ("TemplateTransitionFramePreTask@5578.execute$2");
                    return objLJFF;
                }
            }
        }
        if ((!this.LLJIJIL.isEmpty()) && (nLETemplateModel = this.LLJILJIL.LJIIJ) != null && (mainTrack = nLETemplateModel.getMainTrack()) != null) {
            Boolean.valueOf(mainTrack.removeSlot(this.LLJILJILJ));
        }
        if (C356770Dyl.LIZ()) {
            InterfaceC346201Wa<List<C381540Exc>> interfaceC346201WaLIZ = ((InterfaceC355850DxH) this.LLJILLL.LJIIJ.getValue()).LIZ(this.LLJJ.getCreationId());
            AgS196S0200000_5 agS196S0200000_5 = new AgS196S0200000_5(this.LLJILLL, this.LLJILJIL, 2);
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = null;
            this.LLILZ = null;
            this.LLILZIL = null;
            this.LLILZLL = null;
            this.LLIZ = null;
            this.LLIZLLLIL = null;
            this.LLJ = 2;
            if (interfaceC346201WaLIZ.collect(agS196S0200000_5, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateTransitionFramePreTask@5578.execute$2");
                return objLJFF;
            }
        } else {
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null && (interfaceC346201WaLJJJJLI = iCreationAsyncTaskManagerLIZ.LJJJJLI(this.LLJJ.getCreationId())) != null) {
                AgS196S0200000_5 agS196S0200000_52 = new AgS196S0200000_5(this.LLJILLL, this.LLJILJIL, 3);
                this.LL = null;
                this.LLILLJJLI = null;
                this.LLILLL = null;
                this.LLILZ = null;
                this.LLILZIL = null;
                this.LLILZLL = null;
                this.LLIZ = null;
                this.LLIZLLLIL = null;
                this.LLJ = 3;
                if (interfaceC346201WaLJJJJLI.collect(agS196S0200000_52, this) == objLJFF) {
                    C1C7U.LIZIZ("TemplateTransitionFramePreTask@5578.execute$2");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateTransitionFramePreTask@5578.execute$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
