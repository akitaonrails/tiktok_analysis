package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01q2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.bulletin.LiveBoardsEffectHelper$sendSeiField$1", f = "LiveBoardsEffectHelper.kt", l = {367}, m = "invokeSuspend")
public final class C456001q2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ C397301gZ LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ int LLJILLL;
    public final /* synthetic */ int LLJJ;
    public final /* synthetic */ String LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456001q2(String str, String str2, String str3, String str4, String str5, String str6, String str7, C397301gZ c397301gZ, String str8, String str9, String str10, int i, int i2, String str11, InterfaceC1364105Vn<? super C456001q2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLJ = str7;
        this.LLJI = c397301gZ;
        this.LLJIJIL = str8;
        this.LLJILJIL = str9;
        this.LLJILJILJ = str10;
        this.LLJILLL = i;
        this.LLJJ = i2;
        this.LLJJI = str11;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C456001q2 c456001q2 = new C456001q2(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
        c456001q2.LLILLJJLI = obj;
        return c456001q2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        InterfaceC497601wk interfaceC497601wk;
        int i;
        C1C7U.LIZ("LiveBoardsEffectHelper@31ba.sendSeiField$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        while (C2296808zG.LJI(interfaceC497601wk) && C456101q3.LJIIIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" liveStream?.addSeiField() ");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LIZIZ("BoardEffectService", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC768780UDs interfaceC768780UDs = C456101q3.LIZJ;
            if (interfaceC768780UDs != null) {
                JSONObject jSONObject = new JSONObject();
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                String str3 = this.LLILZIL;
                String str4 = this.LLILZLL;
                String str5 = this.LLIZ;
                String str6 = this.LLIZLLLIL;
                String str7 = this.LLJ;
                C397301gZ c397301gZ = this.LLJI;
                String str8 = this.LLJIJIL;
                String str9 = this.LLJILJIL;
                String str10 = this.LLJILJILJ;
                int i3 = this.LLJILLL;
                int i4 = this.LLJJ;
                String str11 = this.LLJJI;
                jSONObject.put("live_boards_id", str);
                jSONObject.put("live_boards_room_id", str2);
                jSONObject.put("live_boards_anchor_id", str3);
                jSONObject.put("live_boards_apply_timestamp", str4);
                jSONObject.put("live_events_board_type", str5);
                jSONObject.put("live_events_board_source", str6);
                jSONObject.put("live_boards_type", str7);
                jSONObject.put("ai_summary_board_content", c397301gZ.LJIIIZ);
                if (C504670Jqj.LIZ(str5, "queue")) {
                    jSONObject.put("queue_user_type", str8);
                    jSONObject.put("queue_viewers_cnt", c397301gZ.LJIIIIZZ);
                }
                jSONObject.put("live_boards_rec_template_id", str9);
                jSONObject.put("generate_version", str10);
                if (i3 > 0 && i4 > 0) {
                    jSONObject.put("stream_w", i3);
                    jSONObject.put("stream_h", i4);
                }
                if (str11 != null) {
                    jSONObject.put("board_items", new JSONArray(str11));
                }
                i = 1;
                Boolean.valueOf(interfaceC768780UDs.LIZ("live_boards_sei", "1610666006", jSONObject, true));
            } else {
                i = 1;
            }
            long j = C456101q3.LJII;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = i;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("LiveBoardsEffectHelper@31ba.sendSeiField$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBoardsEffectHelper@31ba.sendSeiField$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
