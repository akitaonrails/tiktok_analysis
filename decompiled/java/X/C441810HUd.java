package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.emojibutton.DefaultEmojiBtnAbilityImpl;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0HUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.emojibutton.DefaultEmojiBtnAbilityImpl$2$invokeSuspend$$inlined$combine$1$3", f = "DefaultEmojiBtnAbilityImpl.kt", l = {292}, m = "invokeSuspend")
public final class C441810HUd extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super InterfaceC441910HUn>, Object[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ DefaultEmojiBtnAbilityImpl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441810HUd(InterfaceC1364105Vn interfaceC1364105Vn, DefaultEmojiBtnAbilityImpl defaultEmojiBtnAbilityImpl) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = defaultEmojiBtnAbilityImpl;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC441910HUn> interfaceC346701Wf, Object[] objArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C441810HUd c441810HUd = new C441810HUd(interfaceC1364105Vn, this.LLILZ);
        c441810HUd.LLILLJJLI = interfaceC346701Wf;
        c441810HUd.LLILLL = objArr;
        return c441810HUd.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int size;
        Object c441860HUi;
        MixStudioEntranceControl mixStudioEntranceControl;
        MixStudioEntranceControl mixStudioEntranceControl2;
        String string;
        List listLJJLIIIJILLIZJL;
        C1C7U.LIZ("DefaultEmojiBtnAbilityImpl@2979.<init>$2$invokeSuspend$$inlined$combine$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            Object[] objArr = (Object[]) this.LLILLL;
            EnumC430090Gtj enumC430090Gtj = (EnumC430090Gtj) objArr[0];
            Object obj2 = objArr[1];
            List list = (List) objArr[2];
            C1640006bW c1640006bW = (C1640006bW) objArr[3];
            Object obj3 = objArr[4];
            AbstractC440540HPg abstractC440540HPg = (AbstractC440540HPg) objArr[5];
            boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
            if (C1630706a1.LIZ(enumC430090Gtj)) {
                c441860HUi = C441930HUp.LIZ;
            } else if (obj2 instanceof InterfaceC1632206aG) {
                c441860HUi = C441940HUq.LIZ;
            } else {
                DefaultEmojiBtnAbilityImpl defaultEmojiBtnAbilityImpl = this.LLILZ;
                String str = c1640006bW.LIZIZ;
                if (str != null && (string = a0.LJLIIIL(str).toString()) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{" "}, 0, 6)) != null) {
                    size = listLJJLIIIJILLIZJL.size();
                } else {
                    size = 0;
                }
                if (abstractC440540HPg != null && size >= MixStudioSettings.INSTANCE.typingIconWordCount() && (mixStudioEntranceControl2 = defaultEmojiBtnAbilityImpl.LLILZIL) != null && mixStudioEntranceControl2.LIZJ(defaultEmojiBtnAbilityImpl.LLILZLL) && zBooleanValue && !(abstractC440540HPg instanceof C441120HRm) && !(abstractC440540HPg instanceof C441130HRn) && !C440560HPi.LIZ(abstractC440540HPg)) {
                    c441860HUi = new C441860HUi(EnumC441840HUg.IMAGINE_ENTRANCE);
                } else {
                    DefaultEmojiBtnAbilityImpl defaultEmojiBtnAbilityImpl2 = this.LLILZ;
                    if (abstractC440540HPg != null && ((abstractC440540HPg instanceof C441120HRm) || (((abstractC440540HPg instanceof C441130HRn) || C440560HPi.LIZ(abstractC440540HPg)) && (mixStudioEntranceControl = defaultEmojiBtnAbilityImpl2.LLILZIL) != null && mixStudioEntranceControl.LIZ()))) {
                        c441860HUi = new C441860HUi(EnumC441840HUg.IMAGINE_LOADING);
                    } else if (list != null && !list.isEmpty()) {
                        c441860HUi = new C441860HUi(EnumC441840HUg.RED_DOT);
                    } else if (obj3 != null) {
                        c441860HUi = new C441860HUi(EnumC441840HUg.AI_SELF);
                    } else {
                        c441860HUi = new C441860HUi(EnumC441840HUg.EMOJI);
                    }
                }
            }
            this.LL = 1;
            if (interfaceC346701Wf.emit(c441860HUi, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultEmojiBtnAbilityImpl@2979.<init>$2$invokeSuspend$$inlined$combine$1$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultEmojiBtnAbilityImpl@2979.<init>$2$invokeSuspend$$inlined$combine$1$3");
        return unit;
    }
}
