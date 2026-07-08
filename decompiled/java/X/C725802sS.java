package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02sS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C725802sS extends Message<C725802sS, C725902sT> {
    public static final ProtoAdapter<C725802sS> ADAPTER = new ProtoAdapter<C725802sS>() { // from class: X.02sR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C725802sS decode(ProtoReader protoReader) {
            C725802sS c725802sS = new C725802sS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c725802sS.vbadge_color = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c725802sS.show_vbadge = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c725802sS;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C725802sS c725802sS) {
            C725802sS c725802sS2 = c725802sS;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c725802sS2.show_vbadge) + ProtoAdapter.INT32.encodedSizeWithTag(2, c725802sS2.vbadge_color) + c725802sS2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C725802sS c725802sS) {
            C725802sS c725802sS2 = c725802sS;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c725802sS2.show_vbadge);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c725802sS2.vbadge_color);
            protoWriter.writeBytes(c725802sS2.unknownFields());
        }
    };
    public Boolean show_vbadge;
    public Integer vbadge_color;

    public C725802sS() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C725902sT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
