package X;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.lang.Enum;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0fMC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1124060fMC<W, VM extends ViewModel, T extends Enum<T>> {
    String LIZ();

    List<EnumC742820TBw> LJLI();

    void LLILLJJLI();

    void LLILZ();

    String LLILZIL();

    W LLILZLL();

    void LLIZ(VM vm, InterfaceC21213717zz interfaceC21213717zz);

    boolean LLIZLLLIL();

    T LLJ();

    List<Integer> getMessageType();

    void onCreate(Bundle bundle);

    void onDestroy();

    void onDispose();

    void onEvent(Boolean bool);

    void onExposure(String str);

    void onMessage(IMessage iMessage);

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM);
}
