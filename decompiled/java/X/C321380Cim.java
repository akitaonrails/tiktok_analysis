package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentSug;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.MessagePatch;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Patch;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.CommerceAgentApi;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.MessageChunkResult;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.MessageRemote;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Cim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.service.CommerceAgentRequestService$getAgentSuglistFromSearch$1", f = "CommerceAgentRequestService.kt", l = {44}, m = "invokeSuspend")
public final class C321380Cim extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ InterfaceC321390Cin LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321380Cim(String str, String str2, Integer num, InterfaceC321390Cin interfaceC321390Cin, InterfaceC1364105Vn<? super C321380Cim> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = num;
        this.LLILZIL = interfaceC321390Cin;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C321380Cim(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceAgentRequestService@9114.getAgentSuglistFromSearch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLJJLI;
                String str2 = this.LLILLL;
                Integer num = this.LLILZ;
                C321420Ciq c321420Ciq = new C321420Ciq(str, str2, num);
                MessageRemote messageRemote = MessageRemote.LIZ;
                this.LL = 1;
                messageRemote.getClass();
                new AwS548S0100000_4(c321420Ciq, 28);
                CommerceAgentApi commerceAgentApi = MessageRemote.LIZJ;
                if (commerceAgentApi != null) {
                    obj = commerceAgentApi.commerceSearchCardQuery(str2, str, num, this);
                    if (obj != C099R.LJFF()) {
                        obj = (C1515820pY4) obj;
                    }
                } else {
                    obj = null;
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CommerceAgentRequestService@9114.getAgentSuglistFromSearch$1");
                    return objLJFF;
                }
            }
            C1515820pY4 c1515820pY4 = (C1515820pY4) obj;
            this.LLILZIL.LJ();
            final C013C c013c = new C013C();
            c013c.element = true;
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            if (c1515820pY4 != null) {
                final InterfaceC321390Cin interfaceC321390Cin = this.LLILZIL;
                c1515820pY4.LIZLLL(new C0POE<MessageChunkResult>() { // from class: X.0Cil
                    @Override // X.C0POE
                    public final void onComplete() {
                        interfaceC321390Cin.LIZIZ();
                    }

                    @Override // X.C0POE
                    public final void onFailed(Throwable th) {
                        String message;
                        InterfaceC321390Cin interfaceC321390Cin2 = interfaceC321390Cin;
                        if (th == null || (message = th.getMessage()) == null) {
                            message = "Unknown error";
                        }
                        interfaceC321390Cin2.LJI(message);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
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
                    @Override // X.C0POE
                    public final void onNext(MessageChunkResult messageChunkResult) {
                        List<Patch> list;
                        List<String> list2;
                        Message message;
                        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ;
                        ?? r2;
                        MessageChunkResult messageChunkResult2 = messageChunkResult;
                        if (c013c.element) {
                            interfaceC321390Cin.LJII();
                            c013c.element = false;
                        }
                        if (messageChunkResult2 != null) {
                            if (messageChunkResult2.event == 3 && (message = messageChunkResult2.messages) != null && (commerceAgentMixFeedLIZIZ = message.LIZIZ()) != null && (r2 = commerceAgentMixFeedLIZIZ.text) != 0) {
                                C259800zU<String> c259800zU2 = c259800zU;
                                InterfaceC321390Cin interfaceC321390Cin2 = interfaceC321390Cin;
                                c259800zU2.element = r2;
                                interfaceC321390Cin2.LIZLLL(r2);
                            }
                            if (messageChunkResult2.event == 6) {
                                CommerceAgentSug commerceAgentSug = messageChunkResult2.sug;
                                if (commerceAgentSug == null || (list2 = commerceAgentSug.sugList) == null) {
                                    list2 = C13BV.INSTANCE;
                                }
                                interfaceC321390Cin.LIZ(list2);
                                return;
                            }
                            if (messageChunkResult2.event == 4) {
                                MessagePatch messagePatch = messageChunkResult2.messagePatch;
                                if (messagePatch == null || (list = messagePatch.patchList) == null) {
                                    return;
                                }
                                InterfaceC321390Cin interfaceC321390Cin3 = interfaceC321390Cin;
                                C259800zU<String> c259800zU3 = c259800zU;
                                for (Patch patch : list) {
                                    if (Intrinsics.LJFF(patch.field, "sellpoint")) {
                                        interfaceC321390Cin3.LJFF(patch.value);
                                    } else if (Intrinsics.LJFF(patch.field, "text")) {
                                        try {
                                            CommerceAgentMixFeed commerceAgentMixFeed = (CommerceAgentMixFeed) C321270Cib.LIZ().LJII(patch.value, CommerceAgentMixFeed.class);
                                            if (Intrinsics.LJFF(patch.op, "add")) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(c259800zU3.element);
                                                sbLIZ.append(commerceAgentMixFeed.text);
                                                c259800zU3.element = C2188811AlT.LIZIZ(sbLIZ);
                                            } else if (Intrinsics.LJFF(patch.op, "replace")) {
                                                String str3 = commerceAgentMixFeed.text;
                                                T t = str3;
                                                if (str3 == null) {
                                                    t = "";
                                                }
                                                c259800zU3.element = t;
                                            }
                                            interfaceC321390Cin3.LIZLLL(c259800zU3.element);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }
                                }
                                return;
                            }
                            if (messageChunkResult2.event != 5) {
                                return;
                            }
                            interfaceC321390Cin.LIZJ();
                        }
                    }
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC321390Cin interfaceC321390Cin2 = this.LLILZIL;
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            interfaceC321390Cin2.LJI(message);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceAgentRequestService@9114.getAgentSuglistFromSearch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
