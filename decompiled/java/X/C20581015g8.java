package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15g8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM$init$1$3", f = "StoryThoughtAvatarCreationVM.kt", l = {}, m = "invokeSuspend")
public final class C20581015g8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryThoughtAvatarCreationVM LL;
    public final /* synthetic */ C259800zU<C817600W5m> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20581015g8(StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM, C259800zU<C817600W5m> c259800zU, InterfaceC1364105Vn<? super C20581015g8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyThoughtAvatarCreationVM;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20581015g8(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC20581215gA enumC20581215gA;
        EnumC1405120mfW enumC1405120mfW;
        C1C7U.LIZ("StoryThoughtAvatarCreationVM@cb29.init$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM = this.LL;
        C817600W5m c817600W5m = this.LLILLJJLI.element;
        storyThoughtAvatarCreationVM.LLJIJIL.setValue(c817600W5m);
        storyThoughtAvatarCreationVM.LLIZ.setValue(c817600W5m.text);
        storyThoughtAvatarCreationVM.LLLZLZ.setValue(c817600W5m.textExtras);
        storyThoughtAvatarCreationVM.LLLLLLLZIL.setValue(Boolean.FALSE);
        MutableLiveData<Integer> mutableLiveData = storyThoughtAvatarCreationVM.LLJJ;
        C817600W5m value = storyThoughtAvatarCreationVM.LLJIJIL.getValue();
        if (value == null || (i = value.backgroundIndex) < 0) {
            i = 0;
        }
        mutableLiveData.setValue(Integer.valueOf(i));
        MutableLiveData<EnumC20581215gA> mutableLiveData2 = storyThoughtAvatarCreationVM.LLJLLL;
        C20581115g9 c20581115g9 = EnumC20581215gA.Companion;
        int i2 = c817600W5m.privacyPermission;
        c20581115g9.getClass();
        EnumC20581215gA[] enumC20581215gAArrValues = EnumC20581215gA.values();
        int length = enumC20581215gAArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                enumC20581215gA = enumC20581215gAArrValues[i3];
                if (enumC20581215gA.getValue() == i2) {
                    break;
                }
                i3++;
            } else {
                enumC20581215gA = EnumC20581215gA.EVERYONE;
                break;
            }
        }
        mutableLiveData2.setValue(enumC20581215gA);
        storyThoughtAvatarCreationVM.LLLLL.setValue(c817600W5m.taskId);
        MutableLiveData<List<String>> mutableLiveData3 = storyThoughtAvatarCreationVM.LLLLII;
        List<String> list = c817600W5m.avatarUrls;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        mutableLiveData3.setValue(list);
        MutableLiveData<String> mutableLiveData4 = storyThoughtAvatarCreationVM.LLLLIIL;
        String str = c817600W5m.avatarUri;
        if (str == null) {
            str = "";
        }
        mutableLiveData4.setValue(str);
        C339970DUl c339970DUl = EnumC339980DUm.Companion;
        int i4 = c817600W5m.taskStatus;
        c339970DUl.getClass();
        EnumC339980DUm enumC339980DUmLIZ = C339970DUl.LIZ(i4);
        int i5 = C20580915g7.LIZ[enumC339980DUmLIZ.ordinal()];
        if (i5 != 1 && i5 != 2) {
            enumC1405120mfW = EnumC1405120mfW.SOCIAL_AVATAR;
        } else {
            enumC1405120mfW = EnumC1405120mfW.GENERATED_AVATAR;
        }
        storyThoughtAvatarCreationVM.LLLJ.setValue(enumC1405120mfW);
        storyThoughtAvatarCreationVM.LLLIL.setValue(enumC339980DUmLIZ);
        if (enumC339980DUmLIZ == EnumC339980DUm.IN_PROGRESS) {
            String str2 = c817600W5m.taskId;
            AnonymousClass0956 anonymousClass0956 = storyThoughtAvatarCreationVM.LLLLLLIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            storyThoughtAvatarCreationVM.LLLLLLIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyThoughtAvatarCreationVM), C0PEM.LIZJ, null, new C2141808aG(storyThoughtAvatarCreationVM, str2, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarCreationVM@cb29.init$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
