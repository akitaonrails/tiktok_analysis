package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.EmoteUploadInfo;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JUJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel$appendSuggestEmotes$1$1", f = "SubWaveEmotePageViewModel.kt", l = {672}, m = "invokeSuspend")
public final class C0JUJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0JUV LLILZ;
    public final /* synthetic */ SubWaveEmotePageViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUJ(String str, C0JUV c0juv, SubWaveEmotePageViewModel subWaveEmotePageViewModel, InterfaceC1364105Vn<? super C0JUJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c0juv;
        this.LLILZIL = subWaveEmotePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JUJ(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String idStr;
        C1C7U.LIZ("SubWaveEmotePageViewModel@2b86.appendSuggestEmotes$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            try {
                ArrayList<UserEmote> arrayList = (ArrayList) C19748512Ol.LIZJ.LJIIIIZZ(this.LLILLL, new TypeToken<ArrayList<UserEmote>>() { // from class: X.0JUG
                }.getType());
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (UserEmote userEmote : arrayList) {
                    EmoteModel emoteModel = new EmoteModel();
                    emoteModel.image = userEmote.image;
                    long j = 0;
                    try {
                        User user = userEmote.userInfo;
                        if (user != null && (idStr = user.getIdStr()) != null) {
                            j = CastLongProtector.parseLong(idStr);
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    EmoteUploadInfo emoteUploadInfo = new EmoteUploadInfo();
                    emoteUploadInfo.userInfo = userEmote.userInfo;
                    emoteUploadInfo.emoteUploadSource = userEmote.userEmoteUploadSource;
                    emoteUploadInfo.userId = j;
                    emoteModel.emoteUploadInfo = emoteUploadInfo;
                    emoteModel.emoteId = userEmote.emoteIdStr;
                    emoteModel.auditStatus = userEmote.auditStatus;
                    emoteModel.auditInfo = userEmote.auditInfo;
                    arrayList2.add(new C0JUY(emoteModel, (LiveSubMediaModel) null, 0, 3, 6));
                }
                C189200o6.m2constructorimpl(arrayList2);
                obj2 = arrayList2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C098200Yq c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
                obj2 = c098200Yq;
            }
            C189200o6.m5exceptionOrNullimpl(obj2);
            C0JUV c0juv = this.LLILZ;
            SubWaveEmotePageViewModel subWaveEmotePageViewModel = this.LLILZIL;
            if (C189200o6.m8isSuccessimpl(obj2)) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C0JUE c0jue = new C0JUE(c0juv, (List) obj2, subWaveEmotePageViewModel, null);
                this.LL = obj2;
                this.LLILLJJLI = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c0jue) == objLJFF) {
                    C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.appendSuggestEmotes$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.appendSuggestEmotes$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
