package X;

import Y.AgS196S0200000_5;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.AlgoRaw;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ewt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateFL2VPreTask$execute$2", f = "TemplateFL2VPreTask.kt", l = {162, 166, 175}, m = "invokeSuspend")
public final class C381090Ewt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C381150Ewz LL;
    public CreativeInfo LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ List<Pair<NLETrackSlot, NLETrackSlot>> LLILZLL;
    public final /* synthetic */ C381150Ewz LLIZ;
    public final /* synthetic */ CreativeInfo LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ C0FQS LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381090Ewt(List<Pair<NLETrackSlot, NLETrackSlot>> list, C381150Ewz c381150Ewz, CreativeInfo creativeInfo, String str, C0FQS c0fqs, InterfaceC1364105Vn<? super C381090Ewt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = list;
        this.LLIZ = c381150Ewz;
        this.LLIZLLLIL = creativeInfo;
        this.LLJ = str;
        this.LLJI = c0fqs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381090Ewt(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C381150Ewz c381150Ewz;
        CreativeInfo creativeInfo;
        String str;
        Iterator<Pair<NLETrackSlot, NLETrackSlot>> it2;
        InterfaceC346201Wa<List<C0LSZ>> interfaceC346201WaLJJJJLI;
        String reqKey;
        String reqJson;
        String taskType;
        String prompt;
        AlgoRaw algoRaw;
        AlgoRaw algoRaw2;
        String bizScene;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile;
        C1C7U.LIZ("TemplateFL2VPreTask@ddb5.execute$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TemplateFL2VPreTask@ddb5.execute$2");
                return unit;
            }
            it2 = (Iterator) this.LLILZ;
            str = (String) this.LLILLL;
            creativeInfo = this.LLILLJJLI;
            c381150Ewz = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            List<Pair<NLETrackSlot, NLETrackSlot>> list = this.LLILZLL;
            c381150Ewz = this.LLIZ;
            creativeInfo = this.LLIZLLLIL;
            str = this.LLJ;
            it2 = list.iterator();
        }
        while (it2.hasNext()) {
            Pair<NLETrackSlot, NLETrackSlot> next = it2.next();
            if (C356770Dyl.LIZ()) {
                c381150Ewz.getClass();
                InterfaceC378020Erw interfaceC378020ErwLIZ = C381240Ex8.LIZIZ.LIZ(new C379640EuY(EnumC379630EuX.TEMPLATE, c381150Ewz.LJII, new AwS549S0100000_5(creativeInfo, 1564)));
                NLETrackSlot first = next.getFirst();
                EditorProAIGCTemplateModel editorProAIGCTemplateModelLIZ = C377740ErU.LIZ(first);
                C378160EsA.LIZ.getClass();
                List listLIZJ = C378160EsA.LIZJ(editorProAIGCTemplateModelLIZ);
                boolean zLIZIZ = C378160EsA.LIZIZ(editorProAIGCTemplateModelLIZ, c381150Ewz.LJIIJ, c381150Ewz.LJIIJJI);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("creation_id", creativeInfo.getCreationId());
                jSONObject.put("from_asset_id", str);
                jSONObject.put("from_asset_type", 18);
                List<NLETrackSlot> listLIZIZ = C0OFE.LIZIZ(next);
                ArrayList arrayList = new ArrayList();
                for (NLETrackSlot nLETrackSlot : listLIZIZ) {
                    if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null && (resourceFile = resource.getResourceFile()) != null) {
                        arrayList.add(resourceFile);
                    }
                }
                if (zLIZIZ) {
                    if (listLIZJ.size() >= 2) {
                        C378160EsA.LIZ.getClass();
                        C378160EsA.LIZ(listLIZJ, jSONObject);
                    }
                    C378160EsA.LIZ.getClass();
                    reqKey = "ep_i2i2v_combo";
                    reqJson = "{}";
                    taskType = "ep_i2i2v_video";
                    prompt = "";
                } else {
                    if (editorProAIGCTemplateModelLIZ == null || (algoRaw2 = editorProAIGCTemplateModelLIZ.getAlgoRaw()) == null || (reqKey = algoRaw2.getReqKey()) == null) {
                        reqKey = "";
                    }
                    if (editorProAIGCTemplateModelLIZ == null || (algoRaw = editorProAIGCTemplateModelLIZ.getAlgoRaw()) == null || (reqJson = algoRaw.getReqJson()) == null) {
                        reqJson = "";
                    }
                    if (editorProAIGCTemplateModelLIZ == null || (taskType = editorProAIGCTemplateModelLIZ.getTaskType()) == null) {
                        taskType = "";
                    }
                    if (editorProAIGCTemplateModelLIZ == null || (prompt = editorProAIGCTemplateModelLIZ.getPrompt()) == null) {
                        prompt = "";
                    }
                }
                InterfaceC381940EyG interfaceC381940EyGLIZ = interfaceC378020ErwLIZ.LIZ();
                EnumC381960EyI enumC381960EyI = EnumC381960EyI.TEMPLATE;
                String uuid = first.getUUID();
                if (editorProAIGCTemplateModelLIZ == null || (bizScene = editorProAIGCTemplateModelLIZ.getBizScene()) == null) {
                    bizScene = "";
                }
                interfaceC381940EyGLIZ.LJ(new C381600Exi(null, null, enumC381960EyI, null, null, null, null, 0, null, null, null, false, false, null, null, null, new C382180Eye(creativeInfo, null, null, first, uuid, null, null, "", "", str, prompt, enumC381960EyI, 0, reqKey, reqJson, C786410Ut5.J3(jSONObject), arrayList, null, bizScene, taskType, 2961510), null, 1572859), false, new InterfaceC382370Eyx() { // from class: X.0Ewu
                    @Override // X.InterfaceC382370Eyx
                    public final void LIZ(C377760ErW c377760ErW, EnumC381960EyI enumC381960EyI2, String str2, String str3) {
                    }

                    @Override // X.InterfaceC382370Eyx
                    public final void LJIIJ(String str2) {
                    }
                });
                creativeInfo = creativeInfo;
            } else {
                this.LL = c381150Ewz;
                this.LLILLJJLI = creativeInfo;
                this.LLILLL = str;
                this.LLILZ = it2;
                this.LLILZIL = 1;
                if (c381150Ewz.LJJIJIIJIL(creativeInfo, str, "", "", next, this) == objLJFF) {
                    C1C7U.LIZIZ("TemplateFL2VPreTask@ddb5.execute$2");
                    return objLJFF;
                }
            }
        }
        if (C356770Dyl.LIZ()) {
            InterfaceC346201Wa<List<C381540Exc>> interfaceC346201WaLIZ = ((InterfaceC355850DxH) this.LLIZ.LJIIL.getValue()).LIZ(this.LLIZLLLIL.getCreationId());
            AgS196S0200000_5 agS196S0200000_5 = new AgS196S0200000_5(this.LLIZ, this.LLJI, 4);
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = null;
            this.LLILZ = null;
            this.LLILZIL = 2;
            if (interfaceC346201WaLIZ.collect(agS196S0200000_5, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateFL2VPreTask@ddb5.execute$2");
                return objLJFF;
            }
        } else {
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null && (interfaceC346201WaLJJJJLI = iCreationAsyncTaskManagerLIZ.LJJJJLI(this.LLIZLLLIL.getCreationId())) != null) {
                AgS196S0200000_5 agS196S0200000_52 = new AgS196S0200000_5(this.LLIZ, this.LLJI, 5);
                this.LL = null;
                this.LLILLJJLI = null;
                this.LLILLL = null;
                this.LLILZ = null;
                this.LLILZIL = 3;
                if (interfaceC346201WaLJJJJLI.collect(agS196S0200000_52, this) == objLJFF) {
                    C1C7U.LIZIZ("TemplateFL2VPreTask@ddb5.execute$2");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateFL2VPreTask@ddb5.execute$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
