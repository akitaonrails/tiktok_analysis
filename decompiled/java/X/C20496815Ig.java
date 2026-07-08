package X;

import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS308S0300000_31;

/* JADX INFO: renamed from: X.15Ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20496815Ig extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LiveData<C20496915Ih> LL;
    public final /* synthetic */ Function2<Integer, Intent, Unit> LLILLJJLI;
    public final /* synthetic */ ChooseMusicWithSceneViewModel LLILLL;
    public final /* synthetic */ LiveData<AbstractC20497515In> LLILZ;
    public final /* synthetic */ Object LLILZIL;
    public final /* synthetic */ LiveData<AbstractC20497515In> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20496815Ig(MutableLiveData mutableLiveData, AwS308S0300000_31 awS308S0300000_31, ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel, MutableLiveData mutableLiveData2, Object obj, MutableLiveData mutableLiveData3) {
        super(0);
        this.LL = mutableLiveData;
        this.LLILLJJLI = awS308S0300000_31;
        this.LLILLL = chooseMusicWithSceneViewModel;
        this.LLILZ = mutableLiveData2;
        this.LLILZIL = obj;
        this.LLILZLL = mutableLiveData3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C20496915Ih value = this.LL.getValue();
        if (value != null && value.LIZ == Integer.MAX_VALUE) {
            this.LLILLJJLI.invoke(0, null);
        }
        ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = this.LLILLL;
        chooseMusicWithSceneViewModel.LL = false;
        chooseMusicWithSceneViewModel.LLILLJJLI = false;
        chooseMusicWithSceneViewModel.LLILZ = null;
        chooseMusicWithSceneViewModel.LLILLL = null;
        ((LiveData) chooseMusicWithSceneViewModel.LLILZIL.getValue()).setValue(null);
        ((LiveData) chooseMusicWithSceneViewModel.LLILZLL.getValue()).setValue(new C20496915Ih(0));
        MutableLiveData<AbstractC20497515In> mutableLiveDataVQ2 = chooseMusicWithSceneViewModel.vQ2();
        C20497715Ip c20497715Ip = C20497715Ip.LIZ;
        mutableLiveDataVQ2.setValue(c20497715Ip);
        chooseMusicWithSceneViewModel.wQ2().setValue(c20497715Ip);
        ((LiveData) chooseMusicWithSceneViewModel.LLJ.getValue()).setValue(Boolean.FALSE);
        this.LLILZ.removeObservers((LifecycleOwner) this.LLILZIL);
        this.LLILZLL.removeObservers((LifecycleOwner) this.LLILZIL);
        return Unit.LIZ;
    }
}
