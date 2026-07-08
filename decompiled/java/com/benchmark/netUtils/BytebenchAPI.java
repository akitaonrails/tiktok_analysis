package com.benchmark.netUtils;

import X.AbstractC842530X3j;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface BytebenchAPI {
    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> doGet(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    C0X9S<TypedInput> doPost(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2175608fi Map<String, String> map2, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j);

    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> downloadFile(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2175608fi Map<String, String> map2);

    @InterfaceC1501160pAQ("/bytebench/api/task/group")
    C0X9S<TypedInput> getDefaultBenchmark(@InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2);

    @InterfaceC1501160pAQ("/model/api/arithmetics")
    C0X9S<TypedInput> getModels(@InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC1501170pAR("/bytebench/api/sdk/device/strategy/batch/v2")
    C0X9S<TypedInput> getStrategyCompriseV2(@InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j);

    @InterfaceC1501170pAR("/bytebench/api/task/result")
    C0X9S<TypedInput> reportResult(@InterfaceC1501130pAN Map<String, String> map, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j);
}
