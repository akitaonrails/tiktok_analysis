package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS110S0101000_2;
import kotlin.jvm.internal.AwS116S0101000_8;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0MY8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.scheduler.story.DefaultStoryGroupTaskPublisher$startPublish$publishJob$1$defferTaskList$1$1", f = "DefaultStoryGroupTaskPublisher.kt", l = {122}, m = "invokeSuspend")
public final class C0MY8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MY8(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2, List<String> list, InterfaceC1364105Vn<? super C0MY8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = videoPublishEditModel2;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0MY8 c0my8 = new C0MY8(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0my8.LLILLL = obj;
        return c0my8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Map linkedHashMap;
        C1C7U.LIZ("DefaultStoryGroupTaskPublisher@cdde.startPublish$publishJob$1$defferTaskList$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                linkedHashMap = (Map) this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            C1433240nOs c1433240nOs = C1433240nOs.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLILZ;
            VideoPublishEditModel videoPublishEditModel2 = this.LLILZIL;
            c1433240nOs.getClass();
            if (Intrinsics.LJFF(videoPublishEditModel.getCreationId(), videoPublishEditModel2.getCreationId())) {
                linkedHashMap = C2097608Jq.LJ();
            } else {
                linkedHashMap = new LinkedHashMap();
                C576150Mij c576150MijLIZ = C0MY6.LIZ(C0MY6.LIZ, VideoPublishEditModel.class, C0MY0.class, true, 4);
                try {
                    final CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
                    final CreativeInfo creativeInfo2 = videoPublishEditModel2.getCreativeInfo();
                    final AwS616S0100000_2 awS616S0100000_2 = new AwS616S0100000_2(linkedHashMap, (Map<String, String>) 144);
                    c576150MijLIZ.LIZIZ(videoPublishEditModel2, new InterfaceC576180Mim<C0MY0>(creativeInfo, creativeInfo2, awS616S0100000_2) { // from class: X.0M8L
                        public final CreativeInfo LIZ;
                        public final CreativeInfo LIZIZ;
                        public final Function2<String, String, Unit> LIZJ;
                        public final Map<String, String> LIZLLL = new LinkedHashMap();

                        /* JADX WARN: Multi-variable type inference failed */
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
                        public final void LJFF(String str, Function1<? super String, Unit> function1) {
                            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.LIZLLL;
                            Object obj2 = linkedHashMap2.get(str);
                            if (obj2 == null) {
                                obj2 = (String) C0CHQ.LIZ().LJI().LJIJJ().LIZ(str, this.LIZ, this.LIZIZ).getSecond();
                                linkedHashMap2.put(str, obj2);
                                if (obj2 == null) {
                                    return;
                                }
                            }
                            if (!Intrinsics.LJFF(obj2, str)) {
                                function1.invoke(obj2);
                                this.LIZJ.invoke(str, obj2);
                            }
                        }

                        {
                            this.LIZ = creativeInfo;
                            this.LIZIZ = creativeInfo2;
                            this.LIZJ = awS616S0100000_2;
                        }

                        @Override // X.InterfaceC576180Mim
                        public final void LJ(Field field, Object obj2, Annotation annotation) {
                            LJFF((String) field.get(obj2), new AwS374S0200000_8(field, obj2, 214));
                        }

                        @Override // X.InterfaceC576180Mim
                        public final void LIZ(Field field, String str, Annotation annotation, List list) {
                            LJFF(str, new C020R(list, (List<Pair<String, String>>) str, (String) 9));
                        }

                        @Override // X.InterfaceC576180Mim
                        public final void LIZIZ(Field field, Map map, Object obj2, Annotation annotation) {
                            LJFF((String) map.get(obj2), new AwS368S0200000_2(obj2, map, 152));
                        }

                        @Override // X.InterfaceC576180Mim
                        public final void LIZJ(Field field, String[] strArr, int i2, Annotation annotation) {
                            LJFF(strArr[i2], new AwS116S0101000_8(i2, strArr, 10));
                        }

                        @Override // X.InterfaceC576180Mim
                        public final void LIZLLL(Field field, List list, int i2, Annotation annotation) {
                            LJFF((String) ListProtector.get(list, i2), new AwS110S0101000_2(list, (List<String>) i2, 17));
                        }
                    });
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            C1433240nOs c1433240nOs2 = C1433240nOs.LIZ;
            VideoPublishEditModel videoPublishEditModel3 = this.LLILZIL;
            this.LLILLL = interfaceC497601wk;
            this.LL = linkedHashMap;
            this.LLILLJJLI = 1;
            c1433240nOs2.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C1403010mc7.LIZ.LIZIZ().LIZLLL(16, videoPublishEditModel3, new AwS587S0100000_8(c23260099m, 725), new AwS587S0100000_8(c23260099m, 726));
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultStoryGroupTaskPublisher@cdde.startPublish$publishJob$1$defferTaskList$1$1");
                return objLJFF;
            }
        }
        C23250099c.LIZIZ(interfaceC497601wk, null, null, new C428101lX(linkedHashMap, this.LLILZLL, null), 3);
        C1C7U.LIZIZ("DefaultStoryGroupTaskPublisher@cdde.startPublish$publishJob$1$defferTaskList$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
